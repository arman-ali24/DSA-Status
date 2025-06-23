// binary search algorithm

class binarySearch {
    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                start = mid + 1; 
            } else { // arr[mid] > target
                end = mid - 1; 
            }
        }
        return -1; // target not found
    }
}
