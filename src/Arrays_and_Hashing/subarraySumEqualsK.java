package Arrays_and_Hashing;

import java.util.HashMap;
import java.util.Map;

public class subarraySumEqualsK {
    public static int  subarraySumEqualsK(int[] nums, int k) {
        // to track the how many subarrays that got prefixes when subtracting with k
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0,1);

        int result =0;
        int prefix = 0;
        for (int num : nums) {
            prefix+= num;
            if (sumCountMap.containsKey(prefix - k)) {
                result+= sumCountMap.get(prefix - k);
            }

            sumCountMap.put(prefix, sumCountMap.getOrDefault(prefix, 0) + 1);
        }
        return result;

    }

    public static void main(String[] args) {
        int result = subarraySumEqualsK(new  int[] {1,2-5,5,0,3}, 3);
        System.out.println(result);
    }
}
