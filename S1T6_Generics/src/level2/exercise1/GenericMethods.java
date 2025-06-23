package level2.exercise1;

public class GenericMethods {

    public <T, U> void printArguments(T first, U second, String text) {

        System.out.println("Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + first + "}. Tipo de variable: " + first.getClass().getSimpleName() + ".\n" +
                "Segundo elemento: {" + second + "}. Tipo de variable: " + second.getClass().getSimpleName() + ".\n" +
                "Tercer elemento: {" + text + "}. Tipo de variable: " + text.getClass().getSimpleName() + ".");
    }
}
