import java.util.*;
import java.lang.*;
import java.io.*;

public class p02862 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x+y)%3!= 0 || 3*x < x+y || 3*y < x+y) {
            System.out.println(0);
            return;
        }
        int n = (x+y)/3;
        x -= n;
        y -= n;
        long fact[] = new long[n+1];
        fact[0] = 1;
        for(int i = 1; i <= n; i++) {
            fact[i] = fact[i-1] * i % 1000000007;
        }
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        long c = factN * modinv(factX, 1000000007) * modinv(factY, 1000000007);
        c %= 1000000007;
        System.out.println(c);
    }
    public static long modinv(long a, long m) {
        long g = gcd(a, m);
        if(g!= 1) {
            return -1;
        }
        return (m + m - a) % m;
    }
    public static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}