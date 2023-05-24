package test;

import main.SILab2;
import main.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void testEveryBranchCriterion() {
        // Test case 1: Null user object
        try {
            assertNull("Mandatory information missing!", SILab2.function(null, null));
            fail("Expected RuntimeException to be thrown.");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 2: Null password
        try {
            assertNull("Mandatory information missing!", SILab2.function(null, null));
            fail("Expected RuntimeException to be thrown.");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 3: Null email
        try {
            assertNull("Mandatory information missing!", SILab2.function(new User("username" ,"123", null ), null));
            fail("Expected RuntimeException to be thrown.");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 4: Non-null user object, password, and email
        assertFalse(SILab2.function(new User("username", "password", "email"), null));
    }

    @Test
    public void testMultipleConditionCriterion() {
        // Test case 1: Null user object
        try {
            assertNull("Mandatory information missing!", SILab2.function(null, null));
            fail("Expected RuntimeException to be thrown.");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 2: Null password
        try {
            assertNull("Mandatory information missing!", SILab2.function(null, null));
            fail("Expected RuntimeException to be thrown.");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 3: Null email
        try {
            assertNull("Mandatory information missing!", SILab2.function(new User("username", "password", "email"), null));
            fail("Expected RuntimeException to be thrown.");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 4: Non-null user object, password, and email
        assertFalse(SILab2.function(new User("username", "password", "email"), null));
    }
}
