Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int W = scanner.nextInt();
        int mod = (int)1e9 + 7;
        
        long[] fact = new long[B+W+1];
        fact[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            fact[i] = (fact[i-1] * i) % mod;
        }
        
        long[] invf = new long[B+W+1];
        invf[B+W] = inved(fact[B+W], mod);
        for (int i = B+W-1; i >= 0; i--) {
            invf[i] = (fact[i] * invf[i+1]) % mod;
        }
        
        long[] bina = new long[B+W+1];
        bina[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            bina[i] = (bina[i-1] * 2) % mod;
        }
        
        long[] invb = new long[B+W+1];
        invb[B+W] = inved(bina[B+W], mod);
        for (int i = B+W-1; i >= 0; i--) {
            invb[i] = (bina[i] * invb[i+1]) % mod;
        }
        
        if (B == W) {
            for (int i = 0; i < B+W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            long P = inv
