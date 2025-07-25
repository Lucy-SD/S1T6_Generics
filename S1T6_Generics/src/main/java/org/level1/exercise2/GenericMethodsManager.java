package org.level1.exercise2;

public class GenericMethodsManager {

    public final GenericMethods genericMethods;

    public GenericMethodsManager() {
        this.genericMethods = new GenericMethods();
    }

    public void demostrateMethods(){
        System.out.println("*** Demostrando el método <T, U, V> de GenericMethods ***");

        Person person1 = new Person("Hannah", "Volada", 34);
        Person person2 = new Person("Piti", "Alvarez", 53);

        System.out.println("\n--- Demostrando <Person, String, Integer> ---");
        genericMethods.printArguments(person2, "Prueba Correcta.", 123);

        System.out.println("\n--- Demostrando <String, Person, Double> ---");
        genericMethods.printArguments("Esto también funciona.", person2, 3.14159);

        System.out.println("\n--- Demostrando <Boolean, Character, Person> ---");
        genericMethods.printArguments(true, '!', person1);
    }
}
