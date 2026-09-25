 import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> seen = new HashSet<>();
        
        for (int right = 0; right < s.length(); right++) {
            // If a duplicate character is found, shrink the window from the left
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set and update the max length
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
