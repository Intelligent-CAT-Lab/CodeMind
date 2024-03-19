import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = (x+y)/3;
        x -= n;
        y -= n;
        long fact[] = new long[n+1];
        fact[0] = 1;
        for(int i=1;i<=n;i++)
            fact[i] = fact[i-1]*i;
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        long c = factN * modinv(factX, MOD) * modinv(factY, MOD);
        c %= MOD;
        System.out.println(c);
    }
    static long modinv(long a, long m)
    {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1)
        {
            long q = a / m;
            long t = m;

            m = a % m, a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x = x + m0;

        return x;
    }
}