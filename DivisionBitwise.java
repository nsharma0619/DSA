/**
 * DivisionBitwise
 */
public class DivisionBitwise {

    public static int solution(int dividend, int divisor){
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

        int sign = dividend>0 ^ divisor>0 ? -1 : 1;
        long tmp = Math.abs((long) dividend);
        long divisorTmp = Math.abs((long) divisor);
        int ans = 0;
        while(tmp>=divisorTmp){
            int n=0;
            while((divisorTmp<<n) <= tmp){  
                if(Integer.MAX_VALUE>>1 <= divisorTmp<<n) break;
                n++;
            } 
            n--;
            tmp=tmp-(divisorTmp<<n);
            ans+=(1<<n);
        }
        return ans*sign;
    }

    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE>>1);
        System.out.println(solution(1100540749, -1090366779));
    }
}