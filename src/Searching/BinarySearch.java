package Searching;

public class BinarySearch {
    public static Integer find(Integer[] arr, int k) {
        return binarySearch(arr, 0, arr.length -1, k);
    }

    static Integer binarySearch(Integer[] arr, int startIndex, int endIndex, int k) {

        if(startIndex > endIndex) return -1;
        if(arr[endIndex] == k) return endIndex;

        int middleIndex = (int) Math.floor((float)(startIndex + endIndex) / 2);

        if (arr[middleIndex] < k) return  binarySearch(arr, middleIndex, endIndex, k);
        if (arr[middleIndex] > k) return  binarySearch(arr, startIndex, middleIndex, k);
        return middleIndex;
    }
}
