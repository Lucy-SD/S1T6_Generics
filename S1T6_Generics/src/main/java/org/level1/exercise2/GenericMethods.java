package org.level1.exercise2;

public class GenericMethods {

    public <T, U, V> String formatArguments (T first, U second, V third) {
        return "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + first + "}. Tipo de variable: " + first.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + second + "}. Tipo de variable: " + second.getClass().getSimpleName() +
                ".\nTercer elemento: {" + third + "}. Tipo de variable: " + third.getClass().getSimpleName() + ".";
    }

    public <T, U, V> void printArguments(T first, U second, V third) {
        System.out.println(formatArguments(first, second, third));
    }
}
