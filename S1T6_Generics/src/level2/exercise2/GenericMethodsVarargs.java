package level2.exercise2;

public class GenericMethodsVarargs {

    @SafeVarargs
    public final <T> void printVariableArguments(T... arguments) {
        System.out.println("\n*** Método General con Argumentos Variables (mismo tipo) . . .");

        System.out.println("Cantidad de Argumentos: " + arguments.length +
                "\nTipos de Argumentos: " + ((arguments.length > 0) ?
                arguments.getClass().getSimpleName() : "No hay argumentos."));

        if (arguments.length > 0) {
            System.out.println("Listado de los argumentos:");
            for (int i = 0; i < arguments.length; i++) {
                System.out.printf("Argumento %d: %s%n", i + 1, arguments[i]);
            }
            System.out.println("                                      ***");
        }
    }

    public void printMixedVariableArguments(Object... arguments) {

        System.out.println("\n*** Método General con Argumentos Mixtos y Variables . . .");
        System.out.println("Cantidad de Argumentos: " + arguments.length);

        if (arguments.length > 0) {
            System.out.println("Listado de los argumentos y tipo:");
            for (int i = 0; i < arguments.length; i++) {
                System.out.printf("Argumento %d: %s (Tipo: %s.)%n",
                        i + 1, arguments[i], arguments[i].getClass().getSimpleName());
            }
            System.out.println("                                      ***");
        } else {
            System.out.println("No hay argumentos.");
        }

    }
}
