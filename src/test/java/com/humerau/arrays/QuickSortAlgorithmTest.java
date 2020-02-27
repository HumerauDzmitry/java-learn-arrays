package com.humerau.arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortAlgorithmTest {
    QuickSortAlgorithm quickSortAlgorithm;

    @BeforeEach
    void setUp() {
        quickSortAlgorithm = new QuickSortAlgorithm();
    }

    @DisplayName("Test array is empty")
    @Test
    void shouldBeEmptyGetMissingNumber() {
        assertEquals(quickSortAlgorithm.getArraySortedByQuickSortAlgorithm(new int[]{}), ArrayUtils.EMPTY_INT_ARRAY);
    }

    @DisplayName("Success")
    @Test
    void shouldBeSuccessfulGetMissingNumber() {
        assertEquals(Arrays.toString(quickSortAlgorithm.getArraySortedByQuickSortAlgorithm(new int[]{18,24,7,5,13,20})), Arrays.toString(new int[] {5,7,13,18,20,24}));
    }

    @DisplayName("Test array is null")
    @Test
    void shouldBeNullPointerException() {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            quickSortAlgorithm.getArraySortedByQuickSortAlgorithm(null);
        });
        assertEquals("arr is marked non-null but is null", exception.getMessage());
    }
}