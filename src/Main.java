import DS.ArrayLists;
import DS.HashMaps;
import DS.StringBuilders;
import Finding.QuickSelect;
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

//        Sort with new object:
        System.out.println(BucketSort.sort(arr));

//        Sort in place:
//        QuickSort.sort(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println(QuickSelect.find(arr, 3));

    }
}