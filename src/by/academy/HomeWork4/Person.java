package by.academy.HomeWork4;

import java.time.LocalDate;

public class Person {
    private String nick;
    private String password;
    private LocalDate registration;

    public Person(String nick, String password, LocalDate registration) {
        this.nick = nick;
        this.password = password;
        this.registration = registration;
    }

    public String getNick() {
        return nick;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public String getData(){
        return nick + registration;
    }
}
