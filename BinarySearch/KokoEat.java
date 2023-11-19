package BinarySearch;

public class KokoEat {
    public static int timeTakeToEat(int[] piles, int n){
        int ans = 0;
        for(int pile: piles){
            if(pile<=n) ans++;
            else{
                ans+=Math.ceil(((double)pile)/n);
            }    
        }
        return ans;
    }
    public static int minEatingSpeed(int[] piles, int h) {

        int start = 0;
        int end = 0;
        for(int i: piles) {
            if(end<i) end=i;
        }
        int ans = Integer.MAX_VALUE;
        while(start<=end){
            int mid = (start+end)/2;
            int time = timeTakeToEat(piles, mid);
            System.out.println("mid: "+mid+" time: "+time);
            if(time>h) start = mid+1;
            else{
                ans = Math.min(ans, mid);
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int piles[] = new int[]{30,11,23,4,20};
        System.out.println(minEatingSpeed(piles, 6));
    }
}
