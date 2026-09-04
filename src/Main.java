import DS.ArrayLists;
import Searching.BinarySearch;
import Searching.QuickSelect;
import Sorting.BucketSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        HashMaps.example();
//        ArrayLists.example();
//        StringBuilders.example();

//        Problems.execute();


        Integer[] arr =  {38, 27, 43, 3, 9, 82, 10};

//        Sort with new object:
        List<Integer> sorted = BucketSort.sort(arr);
        Integer[] sortedArr = sorted.toArray(new Integer[0]);
        System.out.println(sorted);

//        Sort in place:
//        QuickSort.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(QuickSelect.find(arr, 3));

        System.out.println(BinarySearch.find(sortedArr, 43));
    }
}