package binarySearch.BSOnAnswers;

import java.util.Arrays;

public class AggresiveCows {

    public static int numberOfCowWithGap(int[] stalls, int MinGap){
        int startIndex = 0;
        int possible = 1;
        for(int i=1;i<stalls.length;i++){
            int gap = stalls[i] - stalls[startIndex];
            if(gap>=MinGap){
                startIndex = i;
                possible++;
            }
        }
        return possible;
    }

    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int min = 0;
        int max = stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(min<=max){
            int mid = (min+max)/2;
            int possibleCow = numberOfCowWithGap(stalls, mid);
            if(possibleCow>=k){
                ans = mid;
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return ans;
    }
}
