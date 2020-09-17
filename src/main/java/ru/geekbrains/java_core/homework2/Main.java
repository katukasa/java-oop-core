package ru.geekbrains.java_core.homework2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        String[][] myArray = new String[4][4];
        myArray[0][0] = "11"; myArray[0][1] = "12"; myArray[0][2] = "13"; myArray[0][3] = "14";
        myArray[1][0] = "21"; myArray[1][1] = "22"; myArray[2][2] = "23"; myArray[1][3] = "24";
        myArray[2][0] = "31"; myArray[2][1] = "32"; myArray[1][2] = "33"; myArray[2][3] = "34";
        myArray[3][0] = "41"; myArray[3][1] = "42"; myArray[3][2] = "43"; myArray[3][3] = "44";

// 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
// MyArrayDataException и вывести результат расчета.

        try {
            System.out.println(convertArray(myArray));
        } catch (MyArraySizeException e){
            System.out.println("Wrong array size");
        } catch (MyArrayDataException e){
            System.out.println("Wrong array data");
        }

        System.out.println("End");
    }

    public static int convertArray(String[]... myArray) throws MyArraySizeException, MyArrayDataException {

// 1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

        if ((myArray.length != 4) & (myArray[0].length != 4)) {
            throw new MyArraySizeException();
        }

// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа),
// надо бросить исключение MyArrayDataException с детализацией, в какой ячейке неверные данные.

        String s;
        int sum = 0;
        int fromString;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                s = myArray[i][j];
                if (s.matches("[-+]?\\d+")){
                    fromString = Integer.parseInt(s);
                    sum = sum + fromString;
                } else {
                    System.out.println("Wrong data in [" + i + "][" + j + "]");
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }

}

//        Памятка по исключениям:

//        String name = null;
//        try {
//            name.equals("Name");
//        } catch (NullPointerException e) {
//            System.out.println("Name not equals");;
//        }
//
//        File file = new File("src/main/resourses/file1.txt");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");;
//        }