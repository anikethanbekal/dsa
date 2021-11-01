package searching.linear;

public class FindMinimum {
    public static void main(String[] args) {
        int[] nums = {23, 45, 58, 10, -100, 19, 90, -10};
        System.out.println(min(nums));
    }

    static int min(int[] arr) {
        int mini = arr[0];

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < mini) {
                mini = arr[index];
            }
        }
        // if none is found then target not found so return -1
        return mini;
    }
}
