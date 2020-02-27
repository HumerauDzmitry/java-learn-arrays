package com.humerau.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateNumbersInArrayTest {
    DuplicateNumbersInArray duplicateNumbersInArray;

    @BeforeEach
    void setUp() {
        duplicateNumbersInArray = new DuplicateNumbersInArray();
    }

    @DisplayName("Test array is empty")
    @Test
    void shouldBeEmptyGetMissingNumber() {
        assertEquals(duplicateNumbersInArray.getDuplicateNumbers(new int[]{}), Collections.EMPTY_SET);
    }

    @DisplayName("no missing characters in the array")
    @Test
    void testGetMissingNumber() {
        assertEquals(duplicateNumbersInArray.getDuplicateNumbers(new int[]{1, 2, 3, 4, 5}), Collections.EMPTY_SET);
    }

    @DisplayName("Success")
    @Test
    void shouldBeSuccessfulGetMissingNumber() {
        Set <Integer> actualSet = new TreeSet<>();
        actualSet.add(5);
        actualSet.add(9);
        actualSet.add(55);
        assertEquals(duplicateNumbersInArray.getDuplicateNumbers(new int[]{5,6,7,12,13,55,9,5,1,55,55,9}), actualSet);
    }

    @DisplayName("Test array is null")
    @Test
    void shouldBeNullPointerException() {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            duplicateNumbersInArray.getDuplicateNumbers(null);
        });
        assertEquals("arr is marked non-null but is null", exception.getMessage());
    }
}