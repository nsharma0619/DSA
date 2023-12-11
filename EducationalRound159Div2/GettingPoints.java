
import java.util.Scanner;

public class GettingPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            long p = sc.nextLong();
            long l = sc.nextLong();
            long t = sc.nextLong();

            int minDayWork = 0;
            int maxDayWork = n;
            int ans = 0;
            while(minDayWork<=maxDayWork){
                int mid = (minDayWork+maxDayWork)/2;
                int numberTask = (mid+6)/7;
                long pointsEarned = mid*l + Math.min(numberTask, 2*mid)*t;
                if(pointsEarned>=p){
                    ans = mid;
                    maxDayWork = mid-1;
                }else{
                    minDayWork = mid+1;
                }
            }
            System.out.println(n-ans);
        }
    }
}
