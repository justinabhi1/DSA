package Arrays_and_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int target, int[] arrayList) {
        Map<Integer, Integer>  hasmap = new HashMap<>();
        for (int i=0 ; i < arrayList.length; i++) {
            int complement = target - arrayList[i];

            if (hasmap.containsKey(complement)) {
                return new int[]{hasmap.get(complement), i};
            }

            hasmap.put(arrayList[i], i);
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] result = twoSum(14, new int[]{1,2,3,4,5,6});
        System.out.println(Arrays.toString(result));
    }

}

