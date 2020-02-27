package com.humerau.arrays;

import lombok.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import java.util.logging.Logger;

public class LargestAndSmallestNumberInArray {
    private static final Logger logger = Logger.getLogger(String.valueOf(LargestAndSmallestNumberInArray.class));

    public int[] getMinMaxValueInArray(@NonNull int[] arr) {
        if (ArrayUtils.isEmpty(arr)) {
            logger.info("empty array");
        } else {
            int[] result = new int[]{arr[0], arr[0]};  //result[0] - min, result[1] - max

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < result[0]) {
                    result[0] = arr[i];
                } else if (arr[i] > result[1]) {
                    result[1] = arr[i];
                }
            }
            return result;
        }
     return ArrayUtils.EMPTY_INT_ARRAY;
    }
}
