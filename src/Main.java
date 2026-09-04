import DS.ArrayLists;
import DS.HashMaps;
import DS.StringBuilders;
import Sorting.BucketSort;
import Sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        HashMaps.example();
//        ArrayLists.example();
//        StringBuilders.example();

//        Problems.execute();


        Integer[] arr =  {38, 27, 43, 3, 9, 82, 10};

//        System.out.println(BucketSort.sort(arr));

        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}