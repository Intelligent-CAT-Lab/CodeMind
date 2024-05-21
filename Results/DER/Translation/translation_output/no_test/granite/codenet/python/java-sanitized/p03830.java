import java.util.*;
import java.io.*;

class Main {
    static int MOD = 100000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                a[j]++;
            }
        }
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= (a[i] + 1);
            ans %= MOD;
        }
        System.out.println(ans);
    }
}