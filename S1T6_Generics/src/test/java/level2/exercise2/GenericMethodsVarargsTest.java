package level2.exercise2;

import org.junit.Before;
import org.junit.Test;
import org.level1.exercise2.Person;
import org.level2.exercise2.GenericMethodsVarargs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericMethodsVarargsTest {

    private GenericMethodsVarargs genericMethods;
    private Person person1, person2, person3;

    @Before
    public void setUp() {
        genericMethods = new GenericMethodsVarargs();
        person1 = new Person("Charlie", "Cord", 33);
        person2 = new Person("Luli", "Bot", 31);
        person3 = new Person("Cris", "Nurs", 28);
    }

    @Test
    public void testGetArgumentSizeWithNoArgs() {
        assertEquals("No hay argumentos.\n", genericMethods.getArgumentsSize());
    }

    @Test
    public void testGetArgumentSizeWithStrings() {
        String result = genericMethods.getArgumentsSize("How ", "you ", "doing ", "¿?");
        assertEquals("Cantidad de Argumentos: 4.\n", result);
    }


/*    @Test
    public void testGetArgumentSizeWithIntegers() {
        String result = genericMethods.getArgumentsSize(7, 21);
        assertEquals("Cantidad de Argumentos: 2.\n", result);
    }*/

 /*   @Test
    public void testGetArgumentSizeWithPersons() {
        String result = genericMethods.getArgumentsSize(person1, person2, person3);
        assertEquals("Cantidad de Argumentos: 3.\n", result);
    }*/

    /*   @Test
       public void testGetArgumentsClassWithStrings () {
           String result = genericMethods.getArgumentsClass("Testeando.");
           assertTrue(result.contains("String"));
       }*/

    @Test
    public void testGetArgumentsClassWithNoArgs() {
        assertEquals("No se puede determinar el tipo de clase de un arreglo vacío.\n", genericMethods.getArgumentsClass());
    }
    @Test
    public void testGetArgumentsClassWithInteger() {
        String result = genericMethods.getArgumentsClass(884);
        assertTrue(result.contains("Integer"));
    }
 /*   @Test
    public void testGetArgumentsClassWithPersons () {
        String result = genericMethods.getArgumentsClass(person3);
        assertTrue(result.contains("Person"));
    }*/

    @Test
    public void testPrintListOfArgsWithNoArgs() {
        assertEquals("Arreglo vacío.", genericMethods.printListOfArguments());
    }

    @Test
    public void testPrintListOfArgsWithPersons() {
        String result = genericMethods.printListOfArguments(person1, person2, person3);
        assertTrue(result.contains("Argumento 1: Datos del Usuario"));
        assertTrue(result.contains("--> Nombre completo: Luli Bot."));
        assertTrue(result.contains("Edad: 28."));


    }

    @Test
    public void testGetMixedArgsSizeWithNoArgs() {
        assertEquals("No hay argumentos.\n", genericMethods.getMixedArgumentsSize());
    }

    @Test
    public void testGetMixedArgsSizeWithMixedArgs() {
        String result = genericMethods.getMixedArgumentsSize(7, "Cuqui", person2);
        assertEquals("Cantidad de Argumentos: 3.\n", result);
    }

    @Test
    public void testPrintListOfMixedArgumentsWithNoArgs() {
        assertEquals("No hay argumentos.\n", genericMethods.printListOfMixedArguments());
    }

    @Test
    public void testPrintListOfMixedArgsWithMixedArgs() {
        String result = genericMethods.printListOfMixedArguments(person1, "Esto es un String", 1.25);
        assertTrue(result.contains("Nombre completo: Charlie Cord."));
        assertTrue(result.contains("(tipo: Person)"));
        assertTrue(result.contains("Esto es un String"));
        assertTrue(result.contains("(tipo: String)"));
        assertTrue(result.contains("1.25"));
        assertTrue(result.contains("(tipo: Double)"));

    }
}

