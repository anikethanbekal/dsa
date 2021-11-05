package searching.binary.applications;

public class CeilingPlusOneCharacter {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        char target = 'a';
        System.out.println(ceil(arr,target));
    }

    static int ceil(char letters[], char target) {
        //if target is less than first number of the array.
        if (target < letters[0]) {
            return -1;
        }
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //either the below mod method or we can add condition
        return letters[start % letters.length];
    }
}
