package org.example;


public class User {
    private final String name;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phone;
    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String name;
        private String lastName;
        private int age;
        private String address;
        private String phone;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder builder(){
            return this;
        }
        public User build() {
            return new User(builder());
        }
    }
}
