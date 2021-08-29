
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

// Given a string s, find the length of the longest substring without repeating characters.
// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("dvdf"));
}
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<Character>();
        int i=0, max=0;

        for(int j =0; j < s.length(); j++){
            char c = s.charAt(j);

            while(seen.contains(c)){
                seen.remove(s.charAt(i++));
            }
            seen.add(c);

            max = Math.max(max, j - i +1);
        }
        return max;
    }
}
