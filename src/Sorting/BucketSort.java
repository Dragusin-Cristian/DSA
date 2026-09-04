package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    public static List<Integer> sort(Integer[] arr) {
        LinkedList<Integer>[] buckets = bucketSort(arr);
        List<Integer> result = new ArrayList<>();

        for (LinkedList<Integer> bucket : buckets) {
            result.addAll(bucket);
        }
        return result;
    }


//    O(n+m)
    static LinkedList<Integer>[] bucketSort(Integer[] arr) {
//        find the min max, and create buckets based on the range
        Integer min = arr[0];
        Integer max = arr[0];

        for(Integer val : arr) {
            if (val > max ) max = val;
            if (val < min) min = val;
        }

        Integer noBuckets = 10;
        Integer bucketRange = (max - min + 1) / noBuckets;

        LinkedList<Integer>[] buckets = new LinkedList[noBuckets];

        for (int i = 0; i< noBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }

//          Add numbers to each bucket and sort buckets
        for (Integer val : arr) {
            int bucketIndex = (val-min)/bucketRange; //? why?
            buckets[bucketIndex].add(val);
        }

        for (LinkedList bucket : buckets) {
            Collections.sort(bucket);
        }

        return buckets;
    }


}
