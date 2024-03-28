import java.util.Scanner;

public class p02715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = (int) (Math.pow(10, 9) + 7);
        int[] X = new int[K + 1];
        int ans = 0;

        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * modPow(K / i, N, P);
        }

        System.out.println(ans % P);
    }

    public static int modPow(int base, int exponent, int mod) {
        if (mod == 1) return 0;
        
        int result = 1;
        base = base % mod;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}