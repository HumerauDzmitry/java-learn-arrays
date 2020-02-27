package com.humerau.arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithoutDuplicateTest {
    ArrayWithoutDuplicate arrayWithoutDuplicate;

    @BeforeEach
    void setUp() {
        arrayWithoutDuplicate = new ArrayWithoutDuplicate();
    }

    @DisplayName("Test array is empty")
    @Test
    void shouldBeEmptyRemoveDuplicate() {
        assertEquals(arrayWithoutDuplicate.removeDuplicate(new int[]{}), ArrayUtils.EMPTY_INT_ARRAY);
    }

    @DisplayName("Success")
    @Test
    void shouldBeSuccessfulRemoveDuplicate() {
        assertEquals(Arrays.toString(arrayWithoutDuplicate.removeDuplicate(new int[]{44, 5, 9, 1, 77, 5, 77, 9, 5})), Arrays.toString(new int[] {1, 5, 9, 44, 77}));
    }

    @DisplayName("Test array is null")
    @Test
    void shouldBeNullPointerException() {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            arrayWithoutDuplicate.removeDuplicate(null);
        });
        assertEquals("arrWithDuplicate is marked non-null but is null", exception.getMessage());
    }

}