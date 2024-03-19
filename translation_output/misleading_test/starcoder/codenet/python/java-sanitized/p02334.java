import java.util.*;
import java.lang.*;
import java.io.*;

public class p02334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long MOD = 1000000007;
        long p = 1;
        long q = 1;
        for(int i = 0; i < N; i++) {
            p = p * (N+K-1-i) % MOD;
            q = q * (i+1) % MOD;
        }
        System.out.println(p * pow(q, MOD-2, MOD) % MOD);
    }
}