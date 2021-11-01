package searching.linear;

//{18,124,1,534,20,52,7,1234}; ans = 4
public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = {18, 124, 1, 534, 20, 52, 7, 1234};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
       /* if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }*/
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if(num<0){
            num =num*-1;
        }
        if(num==0){
            return 1;
        }
        //two way we can count the number
        //a. convert it to string like num + ""(empty string) and take length
        //b. using while loop as below
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
