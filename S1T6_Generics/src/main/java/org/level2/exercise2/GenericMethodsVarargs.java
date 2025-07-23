package org.level2.exercise2;

public class GenericMethodsVarargs {

    @SafeVarargs
    public final <T> String getArgumentsSize(T... arguments) {
        if (arguments.length == 0) {
            return "No hay argumentos.\n";
        }
        return "Cantidad de Argumentos: " + arguments.length + ".\n";
    }

    @SafeVarargs
    public final <T> String getArgumentsClass(T... arguments) {
        return (arguments.length > 0) ? "Arreglo con elementos del tipo: " + arguments[0].getClass().getSimpleName() + ".\n"
                : "No se puede determinar el tipo de clase de un arreglo vacío.\n";
    }

    @SafeVarargs
    public final <T> String printListOfArguments(T... arguments) {
        StringBuilder answer;
        if (arguments.length == 0) {
            return "Arreglo vacío.";
        }
        answer = new StringBuilder("Listado de los argumentos:\n");
        for (int i = 0; i < arguments.length; i++) {
            answer.append("Argumento ").append(i + 1).append(": ").append(arguments[i]).append("\n");
        }
        return answer.toString();
    }

    public String getMixedArgumentsSize(Object... arguments) {
        if (arguments.length == 0) {
            return "No hay argumentos.\n";
        }
        return "Cantidad de Argumentos: " + arguments.length + ".\n";
    }

    public String getMixedArgClass(int i, Object obj) {
        return " (tipo: " + obj.getClass().getSimpleName() + ")\n";
    }

    public String printListOfMixedArguments(Object... arguments) {
        StringBuilder answer;
        if (arguments.length > 0) {
            answer = new StringBuilder("Listado de los argumentos:\n");
            for (int i = 0; i < arguments.length; i++) {
                answer.append("Argumento ").append(i + 1).append(": ").append(arguments[i])
                        .append(getMixedArgClass(i, arguments[i]));
            }
        } else {
            answer = new StringBuilder("No hay argumentos.\n");
        }
        return answer.toString();
    }
}
