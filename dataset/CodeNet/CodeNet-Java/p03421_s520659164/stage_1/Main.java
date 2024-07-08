import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static long ans=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
        if(!check(n,A,B)){
            System.out.println(-1);
            System.exit(0);
        }
        PrintWriter out = new PrintWriter(System.out);
        //int[] ans = new int[n+1];
        int lowerBound = 0;
        int start = 1;
        for(int cnt=1;cnt<=A;cnt++){
            int len = Math.min(B,n-start-A+cnt+1);
            for(int j=0;j<len;j++){
                out.print(lowerBound+len-j);
                out.print(" ");
            }
            start += len;
            lowerBound += len;
        }
        out.flush();
    }
    static boolean check(int n, int a, int b){
        if(a>n||b>n||b>n-a+1) return false;
        int shortest = n%a==0? n/a:(n/a+1);
        return b>=shortest;
    }
}
