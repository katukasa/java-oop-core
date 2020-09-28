package ru.geekbrains.java_core.lesson4.online.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertAllExample {

    @Test
    public void checkFewData(){
        // get from web
        String login = "super_user";
        String fio = "Ivanov Ivan Ivanovich";
        String prof = "mafia";

        Assertions.assertAll("User's data",
                () -> Assertions.assertEquals(login, "Super User"),
                () -> Assertions.assertEquals(fio, "Ivanov Ivan Sidorovich"),
                () -> Assertions.assertEquals(prof, "doctor")
        );
    }
}
