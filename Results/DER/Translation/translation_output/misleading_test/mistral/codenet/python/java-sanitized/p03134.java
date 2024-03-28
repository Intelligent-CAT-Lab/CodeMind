import java.util.*;

public class p03134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mod = 998244353;
        int[] lis = new int[2 * N + 1];
        Arrays.fill(lis, 0);
        lis[0] = 1;
        int R = 0;
        int B = 0;
        int c = 0;
        for (int i = 0; i < N; i++) {
            char n = sc.next().charAt(0);
            if (n == '0') {
                R += 2;
            } else if (n == '1') {
                R += 1;
                B += 1;
            } else {
                B += 2;
            }
            int[] nlis = new int[2 * N + 1];
            Arrays.fill(nlis, 0);
            for (int j = 0; j < 2 * N; j++) {
                if (j < R) {
                    nlis[j + 1] += lis[j];
                    nlis[j + 1] %= mod;
                }
                if (c - j < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= mod;
                }
            }
            lis = nlis;
            c++;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int[] nlis = new int[2 * N + 1];
            Arrays.fill(nlis, 0);
            for (int j = 0; j < 2 * N; j++) {
                if (j < R) {
                    nlis[j + 1] += lis[j];
                    nlis[j + 1] %= mod;
                }
                if (c - j < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= mod;
                }
            }
            lis = nlis;
            c++;
            ans += lis[2 * N];
        }
        System.out.println(ans % mod);
    }
}