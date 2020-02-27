package com.humerau.arrays;

import lombok.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import java.util.*;

public class DuplicateNumbersInArray {

    private final static Logger logger = Logger.getLogger(DuplicateNumbersInArray.class);

    public Set getDuplicateNumbers (@NonNull int[] arr) {
        Set<Integer> result = null;

        if (ArrayUtils.isEmpty(arr)) {
            logger.info("empty array");
        } else {
            Arrays.sort(arr);
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    if (result == null) {
                        result = new TreeSet<>();
                    }
                    result.add(arr[i]);
                }
            }
            if (result != null) {
                return result;
            }
        }
        return Collections.EMPTY_SET;
    }
}
