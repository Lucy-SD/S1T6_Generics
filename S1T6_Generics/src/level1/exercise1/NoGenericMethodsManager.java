package level1.exercise1;

public class NoGenericMethodsManager {

    public void demostrateStringConstructors() {

        NoGenericMethods<String> strings1 = new NoGenericMethods<>("Hola, ", "soy ", "Lucy.");
        NoGenericMethods<String> strings2 = new NoGenericMethods<>(" nombre ¿?", "Cúal ", "es tú ", true);

        System.out.println("\n    --- Demostración de los Constructores con Strings ---\n" +
                "Primer Constructor: " + strings1 + "\nSegundo Constructor: " + strings2);

    }

    public void demostrateIntegerConstructors() {

        NoGenericMethods<Integer> integer1 = new NoGenericMethods<>(1, 2, 3);
        NoGenericMethods<Integer> integer2 = new NoGenericMethods<>(30, 11, 22, true);

        System.out.println("\n    --- Demostración de los Constructores con Integer ---\n" +
                "Primer Constructor: " + integer1 + "\nSegundo Constructor: " + integer2);
    }

    public void demostrateDoubleConstructors() {
        NoGenericMethods<Double> doubles1 = new NoGenericMethods<>(1.1, 2.2, 3.3);
        NoGenericMethods<Double> doubles2 = new NoGenericMethods<>(3.1, 1.2, 2.3, true);

        System.out.println("\n    --- Demostración de los Constructores con Doubles ---" +
                "\nPrimer Constructor: " + doubles1 + "\nSegundo Constructor: " + doubles2);
    }

    public void runAll() {
        System.out.println("\n        *** Demostración de todos los Métodos de NoGenericMethods ***");

        demostrateStringConstructors();
        demostrateIntegerConstructors();
        demostrateDoubleConstructors();
    }
}
