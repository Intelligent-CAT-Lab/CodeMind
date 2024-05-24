import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean[] a = new boolean[100000];
        long MOD = 1000000007;

        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) == '1';
        }

        long an = 0;
        long[] pow2 = new long[100005];
        long[] pow3 = new long[100005];
        long cp2 = 1;
        long cp3 = 1;

        for (int i = 0; i < 100005; i++) {
            pow2[i] = cp2;
            pow3[i] = cp3;
            cp2 = (cp2 * 2) % MOD;
            cp3 = (cp3 * 3) % MOD;
        }

        int ones = 0;

        for (int i = 0; i < n; i++) {
            if (a[i]) {
                int digle = n - i - 1;
                long cur = (pow3[digle] * pow2[ones]) % MOD;
                an = (an + cur) % MOD;
                ones++;
            } else {
            }
        }

        long cur = (pow2[ones]) % MOD;
        an = (an + cur) % MOD;

        System.out.println(an);
    }
}