package BinarySearch;

public class Nthroot {

    public static int NthRoots(int n, int m) {
        // Write your code here.
        int start = 1;
        int end = m;
        while(start<=end){
            int mid = (start+end)/2;
            System.out.println(mid);
            int num = (int)Math.pow(mid, n);     
            if(num==m) return mid;
            if(num>m) end = mid-1;
            else start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // System.out.println(NthRoots(9 ,1953125));
    }
    
}
