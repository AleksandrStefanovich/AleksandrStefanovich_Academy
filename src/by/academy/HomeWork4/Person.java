package by.academy.HomeWork4;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String nick;
    private String password;
    private LocalDate registration;

    public Person(String nick, String password, LocalDate registration) {
        this.nick = nick;
        this.password = password;
        this.registration = registration;
    }
}
