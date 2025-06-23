package level1.exercise2;

public class GenericMethods {

    public <T, U, V> void printArguments(T first, U second, V third) {

        System.out.println("Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + first + "}. Tipo de variable: " + first.getClass().getSimpleName() + ".\n" +
                "Segundo elemento: {" + second + "}. Tipo de variable: " + second.getClass().getSimpleName() + ".\n" +
                "Tercer elemento: {" + third + "}. Tipo de variable: " + third.getClass().getSimpleName() + ".");
    }
}
