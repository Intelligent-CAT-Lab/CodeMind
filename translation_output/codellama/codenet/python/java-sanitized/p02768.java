import java.util.Scanner;

public class p02768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;

        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= (i + 1);
            cnt %= MOD;
        }

        long X = (long) Math.pow(2, n) - 1;
        long A = cnt;
        long B = cnt;
        long ans = (X - A - B) % MOD;

        System.out.println(ans);
    }
}