package Sorting;

public class QuickSort {

    public static void sort(Integer[] arr) {
        quickSort(arr, 0, arr.length -1);
    }

    static void quickSort(Integer[] arr, int startIndex, int endIndex) {

//        only one element remained
        if(startIndex >= endIndex) {
            return;
        }

        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex -1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    static Integer partition(Integer[] arr, int startIndex, int endIndex) {
        int pivotValue = arr[endIndex];

//        the last position of the "smaller than the pivot" region
        int boundaryIndex = startIndex -1;

        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] < pivotValue) {
                boundaryIndex++;
                swap(arr, boundaryIndex, i);
            }
        }

        int finalPivotIndex = boundaryIndex + 1;
        swap(arr, finalPivotIndex, endIndex);
        return finalPivotIndex;
    }

    static void swap(Integer[] arr, Integer i1, Integer i2) {
        Integer tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}
