package com.humerau.arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberInArrayTest {
    MissingNumberInArray missingNumberInArray;

    @BeforeEach
    void setUp() {
        missingNumberInArray = new MissingNumberInArray();
    }

    @DisplayName("Test array is empty")
    @Test
    void shouldBeEmptyGetMissingNumber() {
        assertEquals(missingNumberInArray.getMissingNumber(new int[]{}), ArrayUtils.EMPTY_INT_ARRAY);
    }

    @DisplayName("no missing characters in the array")
    @Test
    void testGetMissingNumber() {
        assertEquals(missingNumberInArray.getMissingNumber(new int[]{1, 2, 3, 4, 5}), ArrayUtils.EMPTY_INT_ARRAY);
    }

    @DisplayName("Success")
    @Test
    void shouldBeSuccessfulGetMissingNumber() {
        assertEquals(Arrays.toString(missingNumberInArray.getMissingNumber(new int[]{5,6,7,12,13,20})), Arrays.toString(new int[] {8, 9, 10, 11, 14, 15, 16, 17, 18, 19}));
    }

    @DisplayName("Test array is null")
    @Test
    void shouldBeNullPointerException() {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            missingNumberInArray.getMissingNumber(null);
        });
        assertEquals("array is marked non-null but is null", exception.getMessage());
    }
}