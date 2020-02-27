package com.humerau.arrays;

import lombok.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class MissingNumberInArray {

    private static final Logger logger = Logger.getLogger(MissingNumberInArray.class);

    public int[] getMissingNumber(@NonNull int[] array) {

        int[] arrValue;
        int countIndexArr;

        if (ArrayUtils.isEmpty(array)) {
            logger.info("empty array");
        } else if (array[array.length - 1] - array[0] + 1 == array.length) {
            logger.info("no missing characters in the array");
        } else {
            countIndexArr = 0;
            arrValue = new int[(array[array.length - 1] - array[0] + 1) - array.length];
            for (int i = 0; i < array.length - 1; i++) {
                int difference = array[i + 1] - array[i];
                if (difference != 1) {
                    for (int j = 1; j < difference; j++) {
                        arrValue[countIndexArr] = array[i] + j;
                        countIndexArr++;
                    }
                }
            }
            return arrValue;
        }
        return ArrayUtils.EMPTY_INT_ARRAY;
    }

    public static void main(String[] args) {
        MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
        missingNumberInArray.printResult(new int[]{2, 3, 5, 8, 9, 11});
        missingNumberInArray.printResult(new int[]{1, 2, 3, 4, 5});
        missingNumberInArray.printResult(new int[]{5,6,7,12,13,20});
        missingNumberInArray.printResult(new int[]{});
    }

    private void printResult(int[] arr) {
        int[] tempArr = getMissingNumber(arr);
        if(ArrayUtils.isNotEmpty(tempArr)) {
            System.out.println(Arrays.toString(tempArr));
        }
    }
}
