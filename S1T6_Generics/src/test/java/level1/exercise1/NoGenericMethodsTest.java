package level1.exercise1;

import org.junit.Test;
import org.level1.exercise1.NoGenericMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoGenericMethodsTest {

    @Test
    public void testFirstConstructor() {
        NoGenericMethods obj = new NoGenericMethods("A", "B", "C");
        assertEquals("A", obj.getString1());
        assertEquals("B", obj.getString2());
        assertEquals("C", obj.getString3());
    }

    @Test
    public void testSecondConstructor() {

        NoGenericMethods obj = new NoGenericMethods("C", "A", "B", true);
        assertEquals("A", obj.getString1());
        assertEquals("B", obj.getString2());
        assertEquals("C", obj.getString3());
    }
}
