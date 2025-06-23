// linear search algorithm

class linearSearch {
    public static int linearsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if target found
            }
        }
        return -1; // if target not found
    }
}