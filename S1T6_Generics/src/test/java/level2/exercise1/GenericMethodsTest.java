package level2.exercise1;

import org.junit.Test;
import org.level1.exercise2.Person;
import org.level2.exercise1.GenericMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMethodsTest{

    private final GenericMethods genericMethods = new GenericMethods();

    @Test
    public void testFormatArgumentsPersonIntegerString(){
        Person person = new Person("Loli", "Prieto", 22);
        Integer num = 321;
        String text = "Prueba Correcta.";

        String result = genericMethods.formatArguments(person, num, text);
        String expected = "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + person + "}. Tipo de variable: " + person.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + num + "}. Tipo de variable: " + num.getClass().getSimpleName() +
                ".\nTercer elemento: {" + text + "}. Tipo de variable: " + text.getClass().getSimpleName() + ".";

        assertEquals(expected, result);
    }

    @Test
    public void testFormatArgumentsDoublePersonString() {
        Double num = 3.14159;
        Person person = new Person("Toni", "Olando", 24);
        String text = "Esto también funciona.";

        String result = genericMethods.formatArguments(num, person, text);
        String expected = "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + num + "}. Tipo de variable: " + num.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + person + "}. Tipo de variable: " + person.getClass().getSimpleName() +
                ".\nTercer elemento: {" + text + "}. Tipo de variable: " + text.getClass().getSimpleName() + ".";

        assertEquals(expected, result);

    }
    @Test
    public void testFormatArgumentsBooleanCharacterString() {
        Boolean bool = true;
        Character chr ='!';
        String text = "Correcto.";

        String result = genericMethods.formatArguments(bool, chr, text);
        String expected = "Llamando al Método Genérico . . .\n" +
                "Primer elemento: {" + bool + "}. Tipo de variable: " + bool.getClass().getSimpleName() +
                ".\nSegundo elemento: {" + chr + "}. Tipo de variable: " + chr.getClass().getSimpleName() +
                ".\nTercer elemento: {" + text + "}. Tipo de variable: " + text.getClass().getSimpleName() + ".";

        assertEquals(expected, result);

    }
}
