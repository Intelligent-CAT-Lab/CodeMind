import java.util.Scanner;

public class p04046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int MOD = 1000000007;
        long[] factorial = new long[H + W + 1];
        long[] invFactorial = new long[H + W + 1];
        
        factorial[0] = 1;
        invFactorial[0] = 1;
        
        for (int i = 1; i <= H + W; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
            invFactorial[i] = pow(factorial[i], MOD - 2, MOD);
        }
        
        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
                answer += (f(H - A, i, factorial, invFactorial, MOD) * f(A, W - i + 1, factorial, invFactorial, MOD)) % MOD;
            answer %= MOD;
        }
        
        System.out.println(answer);
    }
    
    public static long f(int h, int w, long[] factorial, long[] invFactorial, int MOD) {
        return (factorial[h + w - 2] * invFactorial[h - 1] % MOD * invFactorial[w - 1] % MOD) % MOD;
    }
    
    public static long pow(long base, long exponent, int MOD) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
}