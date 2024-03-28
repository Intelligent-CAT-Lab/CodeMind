import java.util.Scanner;
import java.math.BigInteger;

public class p03083 {
    static final int mod = (int)(1e9) + 7;
    
    static int doubling(int n, int m) {
        long y = 1;
        long base = n;
        while (m != 0) {
            if (m % 2 == 1) {
                y *= base;
                y %= mod;
            }
            base *= base;
            base %= mod;
            m /= 2;
        }
        return (int)y;
    }
    
    static int inved(int a) {
        int x = 1, y = 0, u = 0, v = 1;
        int k = a, l = mod;
        while (l != 0) {
            int t = k / l;
            x -= u * t;
            y -= v * t;
            int temp = u;
            u = x;
            x = temp;
            temp = v;
            v = y;
            y = temp;
            temp = l;
            l = k % l;
            k = temp;
        }
        return (x + mod) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
        
        int[] fact = new int[B+W+1];
        int[] invf = new int[B+W+1];
        fact[0] = invf[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            fact[i] = (int)(((long)fact[i-1] * i) % mod);
        }
        invf[B+W] = inved(fact[B+W]);
        for (int i = B+W; i >= 1; i--) {
            invf[i-1] = (int)(((long)invf[i] * i) % mod);
        }

        int[] bina = new int[B+W+1];
        int[] invb = new int[B+W+1];
        bina[0] = invb[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            bina[i] = (int)(((long)bina[i-1] * 2) % mod);
        }
        invb[B+W] = inved(bina[B+W]);
        for (int i = B+W; i >= 1; i--) {
            invb[i-1] = (int)(((long)invb[i] * 2) % mod);
        }

        if (B == W) {
            for (int i = 0; i < B+W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            // ...