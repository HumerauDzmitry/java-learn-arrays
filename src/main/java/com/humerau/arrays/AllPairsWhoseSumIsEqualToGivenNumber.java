package com.humerau.arrays;

import lombok.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import java.util.*;
import java.util.stream.Collectors;
public class AllPairsWhoseSumIsEqualToGivenNumber {

    private static final Logger logger = Logger.getLogger(String.valueOf(AllPairsWhoseSumIsEqualToGivenNumber.class));

    public Set getAllPairsWhoseSumIsEqualToGivenNumber(@NonNull int[] arr, int sumNumber) {
        Set<int[]> result;
        Set<Integer> tempSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        logger.debug(Arrays.toString(arr) + " - " + sumNumber);

        if (ArrayUtils.isEmpty(arr)) {
            logger.info("empty array");
        } else {
            result = new HashSet<>();
            int requiredNumber;
            for (int i = 0; i < arr.length; i++) {
                requiredNumber = sumNumber - arr[i];
                if (tempSet.contains(requiredNumber)) {
                    result.add(new int[]{arr[i], requiredNumber});
                }
            }
            return result;
        }
        return Collections.EMPTY_SET;
    }

    public static void main(String[] args) {
        AllPairsWhoseSumIsEqualToGivenNumber allPairsWhoseSumIsEqualToGivenNumber = new AllPairsWhoseSumIsEqualToGivenNumber();
        allPairsWhoseSumIsEqualToGivenNumber.print(new int[] {1,2,3,4,5,6}, 9);
        allPairsWhoseSumIsEqualToGivenNumber.print(new int[] {}, 9);
        allPairsWhoseSumIsEqualToGivenNumber.print(new int[] {-3,12,3,4,5,6}, 9);
        allPairsWhoseSumIsEqualToGivenNumber.print(null, 9);
    }

    private void print (@NonNull int[] array, int sumNumber) {
        Set<int[]> result = getAllPairsWhoseSumIsEqualToGivenNumber(array, sumNumber);
        for (int[] arr : result) {
            System.out.print(Arrays.toString(arr) + " ");
        }
        System.out.println();
    }
}
