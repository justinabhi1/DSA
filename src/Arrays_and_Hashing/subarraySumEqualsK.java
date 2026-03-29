package Arrays_and_Hashing;

import java.util.HashMap;
import java.util.Map;

public class subarraySumEqualsK {
    public static int  subarraySumEqualsK(int[] nums, int k) {
        // to track the how many subarrays that got prefixes when subtracting with k
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);

        int result =0;
        int prefix = 0;
        for (int num : nums) {
            prefix+= num;
            if (prefixSum.containsKey(prefix - k)) {
                result+= prefixSum.get(prefix - k);
            }

            prefixSum.put(prefix, prefixSum.getOrDefault(prefix, 0) + 1);
        }
        return result;

    }

    public static void main(String[] args) {
        int result = subarraySumEqualsK(new  int[] {1,2-5,5,0,3}, 3);
        System.out.println(result);
    }
}
