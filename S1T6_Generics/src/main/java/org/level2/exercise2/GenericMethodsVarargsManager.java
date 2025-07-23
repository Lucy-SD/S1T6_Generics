package org.level2.exercise2;

import org.level1.exercise2.Person;

public class GenericMethodsVarargsManager {

    private GenericMethodsVarargs genericMethods;

    GenericMethodsVarargsManager() {
        this.genericMethods = new GenericMethodsVarargs();
    }

    public void demostrateVarargsGenericMethods() {
        Person person1 = new Person("Charlie", "Cord", 33);
        Person person2 = new Person("Luli", "Bot", 31);
        Person person3 = new Person("Cris", "Nurs", 28);


        System.out.println("\n*** Método General con Argumentos Variables (mismo tipo) ***");

        System.out.println("\nDemostrando Tipo String (no mixto):\n"
                + genericMethods.getArgumentsSize("Hola", "Manola,", "¿Cómo", "estás?")
                + genericMethods.getArgumentsClass("Hola", "Manola,", "¿Cómo", "estás?")
                + genericMethods.printListOfArguments("Hola", "Manola,", "¿Cómo", "estás?")
                + "                                      ***");

        System.out.println("\nDemostrando Tipo Integer (no mixto):\n"
                + genericMethods.getArgumentsSize(1, 1, 2, 3, 5, 8, 13)
                + genericMethods.getArgumentsClass(1, 1, 2, 3, 5, 8, 13)
                + genericMethods.printListOfArguments(1, 1, 2, 3, 5, 8, 13)
                + "                                      ===");

        System.out.println("\nDemostrando Tipo Person (no mixto):\n"
                + genericMethods.getArgumentsSize(person1, person2, person3)
                + genericMethods.getArgumentsSize(person1, person2, person3)
                + genericMethods.printListOfArguments(person1, person2, person3)
                + "                                      ===");


        System.out.println("\n*** Método General con Argumentos Variables Mixtos ***");

        System.out.println("\nDemostrando Tipos Mixtos:\n"
                + genericMethods.getMixedArgumentsSize(person1, "Esto es un String", 1.25, true, '!')
                + genericMethods.printListOfMixedArguments(person1, "Esto es un String", 1.25, true, '!')
                + "                                      ===");

    }
}
