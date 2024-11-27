package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().builder().name("Bahattin Salih").lastName("As").age(24).build();
        System.out.println(user);


    }
}