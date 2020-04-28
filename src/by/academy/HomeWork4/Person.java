package by.academy.HomeWork4;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Person implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) &&
                Objects.equals(password, person.password) &&
                Objects.equals(registration, person.registration);
    }


    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick +
                ", registration=" + registration +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, registration);
    }
}
