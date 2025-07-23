package org.level2.exercise1;

public class GenericMethods {
    public <T, U> String formatArguments(T first, U second, String text) {

        return "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + first + "}. Tipo de variable: " + first.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + second + "}. Tipo de variable: " + second.getClass().getSimpleName() +
                ".\nTercer elemento: {" + text + "}. Tipo de variable: " + text.getClass().getSimpleName() + ".";
    }

    public <T, U> void printArguments (T fist, U second, String text) {
        System.out.println(formatArguments(fist, second, text));
    }
}
