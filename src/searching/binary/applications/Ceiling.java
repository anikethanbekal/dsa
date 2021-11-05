package searching.binary.applications;

//ceil means smallest ele in a given array that is greater or equal to target array
//arr = [2,3,4,5,15,18,21,30};
//if target = 15 then ceil = 15
//if target =16 then ceil = 18
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10, 15, 19, 25, 30};
        int target = 23;
        System.out.println(ceil(arr, target));
    }

    static int ceil(int arr[], int target) {
        //if target is less than first number of the array.
        if (target < arr[0]) {
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
        return start;
    }
}