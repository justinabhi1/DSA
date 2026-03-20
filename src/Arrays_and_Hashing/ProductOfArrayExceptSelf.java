package Arrays_and_Hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productOfArray(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];

        // prefix
        left[0] = 1;
        for (int i=1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums [i -1];
        }
        // postfix
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right [i + 1] * nums [i + 1];
        }
        // multiply both prefix and postfix
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }

        return  result;
    }

    public static void main(String[] args) {
        int[] result = productOfArray(new int[]{1,2,0,4});
        System.out.println(Arrays.toString(result));
    }
}
