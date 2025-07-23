package org.level1.exercise1;

public class NoGenericMethodsManager {
    NoGenericMethods strings1 = new NoGenericMethods("Hola, ", "soy ", "Lucy.");
    NoGenericMethods strings2 = new NoGenericMethods("nombre ¿?", "Cúal ", "es tú ", true);

    public String getDemonstrationResult() {
        return "\n    --- Demostración de los Diferentes Constructores ---\n" +
                "Primer Constructor: " + strings1 + "\nSegundo Constructor: " + strings2;

    }
}
