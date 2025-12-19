import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            // If duplicate found, remove characters from left
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3
        System.out.println(lengthOfLongestSubstring(""));         // Output: 0
    }
}
