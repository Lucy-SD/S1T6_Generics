package level2.exercise1;

import level1.exercise2.Person;

public class GenericMethodsManager {

    private final GenericMethods genericMethods;

    GenericMethodsManager() {
        this.genericMethods = new GenericMethods();
    }

    public void demostrateMethods() {
        System.out.println("*** Probando el método <T, U, String> de GenericMethods ***");

        Person person1 = new Person("Loli", "Prieto", 22);
        Person person2 = new Person("Toni", "Olando", 24);

        System.out.println("\n--- Probando <Person, Integer, String> ---");
        genericMethods.printArguments(person1, 123, "Prueba Correcta." );

        System.out.println("\n--- Probando <Double, Person, String> ---");
        genericMethods.printArguments(3.14159, person2, "Esto también funciona.");

        System.out.println("\n--- Probando <Boolean, Char, String> ---");
        genericMethods.printArguments(true, '!', "Correcto.");
    }

}
