package searching.binary.applications;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10, 15, 19, 25, 30};
        int target = 23;
        System.out.println(floor(arr, target));
    }

    static int floor(int arr[], int target) {
        //if target is greater than last num in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        //only this is difference
        return end;
    }
}
