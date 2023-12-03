package SlidingWindow.mediumProblem;

import java.util.LinkedList;
import java.util.Queue;

public class MaxConsecutiveOnes3 {
    public int longestOnes(int[] nums, int k) {
        int startIndex = 0;
        int maxLength = 0;
        int countZero = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                q.add(i);
                countZero++;
                if(countZero>k){
                    int index = q.remove();
                    startIndex = index+1;
                    countZero--;
                }
            }
            maxLength = Math.max(maxLength, i-startIndex+1);
        }
        return maxLength;
    }
}
