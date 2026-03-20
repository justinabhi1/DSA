package Arrays_and_Hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNumbers {
    public static int longestCosecutiveNumberCount(int[] nums) {
        if (nums == null || nums.length == 0 )
            return 0;

        // insert into hashSet for o(1) lookups
        Set<Integer> setNumbers = new HashSet<>();
        for (int num : nums) {
            setNumbers.add(num);
        }
        int longestStreak = 0;
        for (int num : setNumbers) {
            int currentStreak;
            if (!setNumbers.contains(num - 1)) {
                int currentNumber = num;
                currentStreak = 1;
                while (setNumbers.contains(currentNumber + 1)) {
                    currentStreak +=1;
                    currentNumber +=1;
                }

                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int result = longestCosecutiveNumberCount(new int[] {1,4,6,5,8,1000,3,7});
        System.out.println(result);
    }
}
