import java.util.*;

public class p03830 {
    static int mod = 100000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                a[j]++;
            }
        }
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= (a[i] + 1);
            ans %= mod;
        }
        System.out.println(ans);
    }
}