package Searching;

public class QuickSelect {

    public static Integer find(Integer[] arr, int K) {
        return quickSelect(arr, 0, arr.length -1, K);
    }

//    Implements the same recursive partition logic from QuickSort,
//    but mirrored (the pivot is first element):
    static Integer quickSelect(Integer[] arr, int startIndex, int endIndex, int K) {
        int pivotValue = arr[startIndex];
        int boundaryIndex = startIndex;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < pivotValue) {
                boundaryIndex++;
                swap(arr, boundaryIndex, i);
            }
        }

        swap(arr, startIndex, boundaryIndex);

        if (K < boundaryIndex) {
            return quickSelect(arr, startIndex, boundaryIndex - 1, K);
        } else if (K > boundaryIndex) {
            return quickSelect(arr, boundaryIndex + 1, endIndex, K);
        } else {
            return arr[K];
        }
    }

    static void swap(Integer[] arr, Integer i1, Integer i2) {
        Integer tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}
