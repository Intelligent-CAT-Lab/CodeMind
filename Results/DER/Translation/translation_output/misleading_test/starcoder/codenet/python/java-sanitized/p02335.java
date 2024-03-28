import java.util.*;
import java.lang.*;
import java.io.*;

public class p02335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long MOD = 1000000007;
        long ans = 1;
        for(int i = 0; i < n; i++) {
            ans = (ans * (k-i)) % MOD;
        }
        System.out.println(ans);
    }
}