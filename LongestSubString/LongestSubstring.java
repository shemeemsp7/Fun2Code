import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
        //abcabcbb
        Set<Character> setOfChar = new LinkedHashSet<Character>();
        String currentLargest = "";
        for(char c: s.toCharArray()){
            if(!setOfChar.contains(c)){
                setOfChar.add(c);
            }else{
                String temp =getStringFromSet(setOfChar);
                currentLargest = currentLargest.length() > temp.length() ? currentLargest : temp;
                setOfChar.remove(c);
                setOfChar.add(c);
            }
        }
        String temp =getStringFromSet(setOfChar);
        currentLargest = currentLargest.length() > temp.length() ? currentLargest : temp;
        return currentLargest.length();
    }

    public static String getStringFromSet(Set<Character> setofChars){
        StringBuilder sb= new StringBuilder();
        for(char c: setofChars){
            sb.append(c);
        }
        return sb.toString();
    }
}
