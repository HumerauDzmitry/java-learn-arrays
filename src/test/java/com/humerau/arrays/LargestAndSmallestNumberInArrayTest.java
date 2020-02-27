package com.humerau.arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LargestAndSmallestNumberInArrayTest {
    LargestAndSmallestNumberInArray largestAndSmallestNumberInArray;

    @BeforeEach
    void setUp() {
        largestAndSmallestNumberInArray = new LargestAndSmallestNumberInArray();
    }

    @DisplayName("Test array is empty")
    @Test
    void shouldBeEmptyGetMissingNumber() {
        assertEquals(largestAndSmallestNumberInArray.getMinMaxValueInArray(new int[]{}), ArrayUtils.EMPTY_INT_ARRAY);
    }

    @DisplayName("Success")
    @Test
    void shouldBeSuccessfulGetMissingNumber() {
        assertEquals(Arrays.toString(largestAndSmallestNumberInArray.getMinMaxValueInArray(new int[]{5,6,7,3,12,13,20,11})), Arrays.toString(new int[] {3, 20}));
    }

    @DisplayName("Test array is null")
    @Test
    void shouldBeNullPointerException() {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            largestAndSmallestNumberInArray.getMinMaxValueInArray(null);
        });
        assertEquals("arr is marked non-null but is null", exception.getMessage());
    }
}