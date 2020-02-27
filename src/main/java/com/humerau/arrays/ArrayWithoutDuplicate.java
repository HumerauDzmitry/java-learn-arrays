package com.humerau.arrays;

import lombok.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayWithoutDuplicate {

    private static final Logger logger = Logger.getLogger(String.valueOf(ArrayWithoutDuplicate.class));

    public int[] removeDuplicate(@NonNull int[] arrWithDuplicate) {

        if (ArrayUtils.isEmpty(arrWithDuplicate)) {
            logger.info("empty array");
        } else {
            Arrays.sort(arrWithDuplicate);
            int[] result;
            int countDuplicate = 0;
            int countWithoutDuplicate = 0;
            int tempValue = arrWithDuplicate[0];
            int variableToDelete = arrWithDuplicate[0] - 1;

            for (int i = 1; i < arrWithDuplicate.length; i++) {
                if (arrWithDuplicate[i] == tempValue) {
                    countDuplicate++;
                    arrWithDuplicate[i] = variableToDelete;
                } else {
                    tempValue = arrWithDuplicate[i];
                }
            }

            result = new int[arrWithDuplicate.length - countDuplicate];
            for (int i = 0; i < arrWithDuplicate.length; i++) {
                if (arrWithDuplicate[i] != variableToDelete) {
                    result[countWithoutDuplicate] = arrWithDuplicate[i];
                    countWithoutDuplicate++;
                }
            }
            return result;
        }
        return ArrayUtils.EMPTY_INT_ARRAY;
    }

    public static void main(String[] args) {
        ArrayWithoutDuplicate arrayWithoutDuplicate = new ArrayWithoutDuplicate();
        arrayWithoutDuplicate.printResult(new int[]{44, 5, 9, 1, 77, 5, 77, 9, 5});
        arrayWithoutDuplicate.printResult(new int[]{});
        arrayWithoutDuplicate.printResult(new int[]{1,2,3,4,5});

    }

    private void printResult(int[] arr) {
        int[] tempArr = removeDuplicate(arr);
        if(ArrayUtils.isNotEmpty(tempArr)) {
            System.out.println(Arrays.toString(tempArr));
        }
    }
}
