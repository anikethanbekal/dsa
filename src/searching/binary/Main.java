package searching.binary;

public class Main {
    public static void main(String[] args) {
        int nums[] = {-10, -5, 0, 1, 5, 10, 19, 52, 95};
        int target = -10;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }
    // serach in the array: return the index if item found
    // otherwise if item not found return -1

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find mid element
            //int mid = (start+end)/2; //might be possible that it returns huge number which is out of scope of int so m2 is used
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //and found
                return mid;
            }
        }
        return -1;

    }
}
