package level1.exercise2;

public class GenericMethodsManager {

    public final GenericMethods genericMethods;

    public GenericMethodsManager() {
        this.genericMethods = new GenericMethods();
    }

    public void demostrateMethods(){
        System.out.println("*** Probando el método <T, U, V> de GenericMethods ***");

        Person person1 = new Person("Loli", "Prieto", 22);
        Person person2 = new Person("Toni", "Olando", 24);

        System.out.println("\n--- Probando <Person, String, Integer> ---");
        genericMethods.printArguments(person2, "Prueba Correcta.", 123);

        System.out.println("\n--- Probando <String, Person, Double> ---");
        genericMethods.printArguments("Esto también funciona.", person2, 3.14159);

        System.out.println("\n--- Probando <Boolean, Char, Person> ---");
        genericMethods.printArguments(true, '!', person1);


    }

    }
