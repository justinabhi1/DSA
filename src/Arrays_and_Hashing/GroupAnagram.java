package Arrays_and_Hashing;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagram(String[] list) {
        if (list == null || list.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String string : list) {
            int[] charCount = new int[26];
            for (Character c : string.toCharArray()) {
                charCount[ c - 'a'] ++;
            }

            String uniqueKey = Arrays.toString(charCount);

            if (!map.containsKey(uniqueKey)) {
                map.put(uniqueKey, new ArrayList<>());
            }

            map.get(uniqueKey).add(string);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<List<String>> result = groupAnagram(new String[]{"abhinav", "vanibha", "abhi", "ihab"});
        System.out.println(result);
    }
}
