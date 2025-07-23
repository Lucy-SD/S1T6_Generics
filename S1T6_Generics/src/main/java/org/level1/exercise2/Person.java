package org.level1.exercise2;

public class Person {
    private final String name;
    private final String lastName;
    private final int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Datos del Usuario --> Nombre completo: " + this.name + " " + this.lastName + ". Edad: " + this.age + ".";
    }
}
