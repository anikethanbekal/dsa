package searching.binary;

//OrderAgnostic in this program it check if given array is  ascending or descending order
//and then does binary search accordingly.
public class OrderAgnostic {
    public static void main(String[] args) {
        //int nums[] = {-10, -5, 0, 1, 5, 10, 19, 52, 95}; //asc order
        int nums[] = {95, 52, 19, 15, 5, 0, -15, -90, -99}; //des order
        int target = -15;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }
    // serach in the array: return the index if item found
    // otherwise if item not found return -1

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether ascending or descending order

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            //find mid element
            //int mid = (start+end)/2; //might be possible that it returns huge number which is out of scope of int so m2 is used
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}