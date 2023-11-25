// https://leetcode.com/problems/kth-missing-positive-number/
package binarySearch.BSOnAnswers;

/**
 * KthMissingPosNum
 */
public class KthMissingPosNum {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            int numMissing = arr[mid]-1-mid;
            if(numMissing<k) start=mid+1;
            else end = mid-1;
        }
        return k+1+end; // arr[end]+more
    }
}