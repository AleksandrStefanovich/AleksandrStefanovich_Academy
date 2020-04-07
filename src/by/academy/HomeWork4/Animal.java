package by.academy.HomeWork4;

public class Animal {
    private int age;
    private String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    public String getData(){
        return nick + age;
    }
}
