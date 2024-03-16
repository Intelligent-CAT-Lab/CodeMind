import java.util.*;
import java.math.*;

public class p02768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;
        long X = (long)Math.pow(2,n)%MOD;
        long A = 1;
        for(int i=0;i<a;i++) A = (A*n-i)%MOD;
        A = (A*pow(n-a,MOD-2,MOD))%MOD;
        long B = 1;
        for(int i=0;i<b;i++) B = (B*n-i)%MOD;
        B = (B*pow(n-b,MOD-2,MOD))%MOD;
        System.out.println((X-A-B+MOD)%MOD);
    }
}