package level2.exercise2;

import level1.exercise2.Person;

public class GenericMethodsVarargsManager {

    private GenericMethodsVarargs genericMethods;

    GenericMethodsVarargsManager() {
        this.genericMethods = new GenericMethodsVarargs();
    }

    public void demostrateVarargsGenericMethods() {
        Person person1 = new Person("Charlie", "Cord", 33);
        Person person2 = new Person("Luli", "Bot", 31);
        Person person3 = new Person("Cris", "Nurs", 28);

        System.out.println("\nProbando Tipo String (no mixto):");
        genericMethods.printVariableArguments("Hola", "Manola,", "¿Cómo", "estás?");

        System.out.println("\nProbando Tipo Integer (no mixto):");
        genericMethods.printVariableArguments(1, 1, 2, 3, 5, 8, 13);

        System.out.println("\nProbando Tipo Person (no mixto):");
        genericMethods.printVariableArguments(person1, person2, person3);

        System.out.println("\nProbando Tipos Mixtos:");
        genericMethods.printMixedVariableArguments(person1, "Esto es un String", 1.25, true, '!');
    }
}
