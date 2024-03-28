import java.util.*;
import java.io.*;

public class p03083 {
    static long mod = (long)1e9 + 7;
    static long doubling(long n, long m) {
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
        return y;
    }
    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            x = u;
            y = v;
            u = x - u * (k / l);
            v = y - v * (k / l);
            k = l;
            l = k % l;
        }
        return x % mod;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int B = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        long[] fact = new long[B+W+1];
        long[] invf = new long[B+W+1];
        long[] bina = new long[B+W+1];
        long[] invb = new long[B+W+1];
        fact[0] = 1;
        invf[0] = 1;
        bina[0] = 1;
        invb[0] = 1;
        for (int i = 1; i < B+W+1; i++) {
            fact[i] = (fact[i-1] * i) % mod;
            invf[i] = inved(fact[i]);
            bina[i] = (bina[i-1] * 2) % mod;
            invb[i] = inved(bina[i]);
        }
        if (B == W) {
            for (int i = 0; i < B+W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = W+1; i < B+1; i++) {
                long F = (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B+1; i < B+W+1; i++) {
                long F = invf[i-1-B] * invf[B-1];
                F %= mod;
                F *= fact[i-2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        } else {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = B+1; i < W+1; i++) {
                long F = (fact[i-2] * invf[i-1-B] * invf[B-1]) % mod;
                F *= mod - 1;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = W+1; i < B+W+1; i++) {
                long F = invf[i-1-B] * invf[B-1];
                F %= mod;
                F *= fact[i-2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i-2] * invf[i-1-W] * invf[W-