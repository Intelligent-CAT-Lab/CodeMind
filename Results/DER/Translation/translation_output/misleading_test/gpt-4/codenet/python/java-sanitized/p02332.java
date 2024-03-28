import java.util.Scanner;

public class p02332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // Reading input
        long K = sc.nextLong(); // Reading input
        sc.close(); // Closing the Scanner
        
        final long MOD = 1000000007L; // 10**9 + 7 in Java

        if (K < N) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        for (long v = K; v > K - N; v--) {
            ans = ans * v % MOD;
        }
        System.out.println(ans);
    }
}