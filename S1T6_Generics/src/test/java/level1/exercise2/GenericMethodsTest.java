package level1.exercise2;

import org.junit.Test;
import org.level1.exercise2.GenericMethods;
import org.level1.exercise2.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMethodsTest {
    private final GenericMethods genericMethods = new GenericMethods();


    @Test
    public void testFormatArgumentsPersonStringInteger() {

        Person person = new Person("Hannah", "Volada", 34);
        String text = "Prueba Correcta.";
        Integer num = 123;

        String result = genericMethods.formatArguments(person, text, num);
        String expected = "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + person + "}. Tipo de variable: " + person.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + text + "}. Tipo de variable: " + text.getClass().getSimpleName() +
                ".\nTercer elemento: {" + num + "}. Tipo de variable: " + num.getClass().getSimpleName() + ".";

        assertEquals(expected, result);
    }

    @Test
    public void testFormatArgumentsStringPersonDouble() {
        String text = "Esto también funciona.";
        Person person = new Person("Piti", "Alvarez", 53);
        Double num = 3.14159;

        String result = genericMethods.formatArguments(text, person, num);

        String expected = "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + text + "}. Tipo de variable: " + text.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + person + "}. Tipo de variable: " + person.getClass().getSimpleName() +
                ".\nTercer elemento: {" + num + "}. Tipo de variable: " + num.getClass().getSimpleName() + ".";
        assertEquals(expected, result);
    }

    @Test
    public void testFormatArgumentsBooleanCharacterPerson() {

        Boolean bool = true;
        Character chr = '!';
        Person person = new Person("Hannah", "Volada", 34);

        String result = genericMethods.formatArguments(bool, chr, person);
        String expected = "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + bool + "}. Tipo de variable: " + bool.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + chr + "}. Tipo de variable: " + chr.getClass().getSimpleName() +
                ".\nTercer elemento: {" + person + "}. Tipo de variable: " + person.getClass().getSimpleName() + ".";

        assertEquals(expected, result);
    }
}
