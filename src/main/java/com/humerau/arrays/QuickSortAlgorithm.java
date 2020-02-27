package com.humerau.arrays;

import lombok.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class QuickSortAlgorithm {
    private static final Logger logger = Logger.getLogger(QuickSortAlgorithm.class);
    private int[] tempArr;

    public void setTempArr(int[] tempArr) {
        this.tempArr = tempArr;
    }

    public int[] getArraySortedByQuickSortAlgorithm (@NonNull int[] arr) {
        if (ArrayUtils.isEmpty(arr)) {
            logger.info("empty array");
        } else {
            setTempArr(arr);
            quickSort (0, tempArr.length-1);
            logger.debug(Arrays.toString(tempArr));
            return this.tempArr;
        }
        return ArrayUtils.EMPTY_INT_ARRAY;
    }

    private void quickSort (int low, int high) {
        int i = low;
        int j = high;
        int pivot = tempArr[low + (high - low) / 2];
        logger.info("low = " + low + ", high = " + high + ", pivot = " + pivot + " - " + Arrays.toString(tempArr));

        while (i <= j) {
            while (tempArr[i] < pivot) {
                i++;
            }
            while (tempArr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = tempArr[i];
                tempArr[i] = tempArr[j];
                tempArr[j] = temp;
                i++;
                j--;
                logger.debug(Arrays.toString(tempArr));
            }
        }

        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }
}
