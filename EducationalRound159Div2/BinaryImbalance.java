package EducationalRound159Div2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryImbalance {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            boolean ifPossible = false;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='0'){
                    ifPossible=true;
                }
            }
            if(ifPossible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
