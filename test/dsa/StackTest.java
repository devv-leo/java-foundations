package dsa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.naming.CompositeName;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    @DisplayName("Stack should be empty")
    public void newStack_isEmptyTest(){
        Stack strings = new Stack();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addElement_stackIsNotEmpty() {
        Stack strings = new Stack();
        assertTrue(strings.isEmpty());

        strings.push("G-Strings");
        assertFalse(strings.isEmpty());
        assertFalse(strings.isEmpty());

        String popped = strings.pop();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void pushTwoElements_popOneElement_StackIsNotEmptyTest() {
        Stack strings = new Stack();
        strings.push("G-strings");
    }
}
