package level1.exercise1;

public class NoGenericMethodsManager {

    public void demostrateStringConstructors() {

        NoGenericMethods strings1 = new NoGenericMethods("Hola, ", "soy ", "Lucy.");
        NoGenericMethods strings2 = new NoGenericMethods("nombre ¿?", "Cúal ", "es tú ", true);

        System.out.println("\n    --- Demostración de los Constructores con Strings ---\n" +
                "Primer Constructor: " + strings1 + "\nSegundo Constructor: " + strings2);

    }

    public void demostrateIntegerConstructors() {

        NoGenericMethods integer1 = new NoGenericMethods(1, 2, 3);
        NoGenericMethods integer2 = new NoGenericMethods(30, 11, 22, true);

        System.out.println("\n    --- Demostración de los Constructores con Integer ---\n" +
                "Primer Constructor: " + integer1 + "\nSegundo Constructor: " + integer2);
    }

    public void demostrateDoubleConstructors() {
        NoGenericMethods doubles1 = new NoGenericMethods(1.1, 2.2, 3.3);
        NoGenericMethods doubles2 = new NoGenericMethods(3.1, 1.2, 2.3, true);

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
