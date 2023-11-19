import java.util.Scanner;

public class MilicaAndString {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            int target = sc.nextInt();
            sc.nextLine();
            String str= sc.nextLine();
            int countB = 0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='B') countB++;
            }
            if(countB == target){
                System.out.println(0);
                continue;
            }else if(countB>target){
                int extraB = countB-target;
                int bCounter = 0;
                for(int i=0;i<n;i++){
                    if(bCounter==extraB) break;
                    if(str.charAt(i)=='B') bCounter++;
                }
                System.out.println(1);
                System.out.println((bCounter+1)+" "+"A");
            }else{
                int remainingB = target - countB;
                int AthCounter = 0;
                for(int i=0;i<n;i++){
                    if(remainingB==AthCounter) break;
                    if(str.charAt(i)=='A') AthCounter++;
                }
                System.out.println(1);
                System.out.println(AthCounter+" "+"B");
            }
        }
    }
}
