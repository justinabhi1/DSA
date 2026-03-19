package Arrays_and_Hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicateElement(int[] integerArray) {
        Set<Integer> set = new HashSet<>();
        for(Integer num : integerArray) {
            if (set.contains(num)) {
                return  true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = containsDuplicateElement(new int[]{1,2,3,6,5,4});
        System.out.println(result);
    }
}
