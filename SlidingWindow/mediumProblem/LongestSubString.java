package SlidingWindow.mediumProblem;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, length = 0, strStartIndex = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                if(strStartIndex>mp.get(s.charAt(i))){
                    length++;
                    mp.put(s.charAt(i), i);
                }else{
                    maxLength = Math.max(maxLength, length);
                    strStartIndex = mp.get(s.charAt(i))+1;
                    length = i-mp.get(s.charAt(i));
                    mp.put(s.charAt(i), i);
                }

            }else{
                length++;
                mp.put(s.charAt(i), i);
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }
}
