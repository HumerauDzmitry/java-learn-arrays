package com.humerau.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AllPairsWhoseSumIsEqualToGivenNumberTest {
    AllPairsWhoseSumIsEqualToGivenNumber allPairsWhoseSumIsEqualToGivenNumber;

    @BeforeEach
    void setUp() {
        allPairsWhoseSumIsEqualToGivenNumber = new AllPairsWhoseSumIsEqualToGivenNumber();
    }

    @DisplayName("Test array is empty")
    @Test
    void shouldBeEmptyGetAllPairsWhoseSumIsEqualToGivenNumber() {
        assertEquals(allPairsWhoseSumIsEqualToGivenNumber.getAllPairsWhoseSumIsEqualToGivenNumber(new int[]{}, 1), Collections.EMPTY_SET);
    }

    @DisplayName("Success")
    @Test
    void shouldBeSuccessfulRemoveDuplicate() {
        Set<int[]> actualSet = new HashSet<>();
        actualSet.add(new int[]{3, 6});
        actualSet.add(new int[]{6, 3});
        actualSet.add(new int[]{4, 5});
        actualSet.add(new int[]{5, 4});
//        assertEquals(allPairsWhoseSumIsEqualToGivenNumber.getAllPairsWhoseSumIsEqualToGivenNumber(new int[]{1,2,3,4,5,6}, 9), Arrays.toString(actualSet.toArray()));
    }

    @DisplayName("Test array is null")
    @Test
    void shouldBeNullPointerException() {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            allPairsWhoseSumIsEqualToGivenNumber.getAllPairsWhoseSumIsEqualToGivenNumber(null, 1);
        });
        assertEquals("arr is marked non-null but is null", exception.getMessage());
    }
}