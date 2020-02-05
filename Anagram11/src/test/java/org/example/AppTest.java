package org.example;

/*import static org.junit.Assert.assertTrue;

import org.junit.Test;*/

/**
 * Unit test for simple App.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    Anagram stringAnagram = new Anagram();

    @Test
    public void checkThatBatAndTabAreAnagrams() {
        Assertions.assertTrue(stringAnagram.checkAnagram("bat", "tab"));
    }
    @Test
    public void checkThatListenAndSilentAreAnagrams() {
        Assertions.assertTrue(stringAnagram.checkAnagram("listen", "silent"));
    }
    @Test
    public void checkThatOneStringIsConvertedToLowerCase() {
        Assertions.assertTrue(stringAnagram.checkAnagram("listen", "Silent"));
    }
    @Test
    public void checkThatBothStringsAreConvertedToLowerCase() {
        Assertions.assertTrue(stringAnagram.checkAnagram("Listen", "Silent"));
    }
    @Test
    public void checkSingleCharacterStringsWork() {
        Assertions.assertTrue(stringAnagram.checkAnagram("c", "h"));
    }
    @Test
    public void checkEmptyStringsWork() {
        Assertions.assertTrue(stringAnagram.checkAnagram("", ""));
    }
    @Test
    public void checkEmptyStringsReturnTrue() {
        Assertions.assertTrue(stringAnagram.checkAnagram("", ""));
    }
    @Test
    public void checkThatHelloAndHiAreNotAnagrams() {
        Assertions.assertFalse(stringAnagram.checkAnagram("Hello", "Hi"));
    }
    @Test
    public void testThatSpacesAreIgnored() {
        Assertions.assertTrue(stringAnagram.checkAnagram("The eyes", "They see"));
    }
    @Test
    public void testThatSpacesAreIgnoredInOneWord() {
        Assertions.assertTrue(stringAnagram.checkAnagram("Astronomer", "Moon starer"));
    }
}