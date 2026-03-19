package Arrays_and_Hashing;

public class IsAnagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] charCount = new int[26];

        //maintain a integer Array for each alphabet and maintain balance count
        for (int i = 0; i<s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        for (Integer count : charCount) {
            if (count!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isAnagram("abhinav", "vanihbw");
        System.out.println(result);
    }
}
