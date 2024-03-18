import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p01809 {
    private static final int MOD = 998244353;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        String[] tokens = reader.readLine().split(" ");
        int p = Integer.parseInt(tokens[0]);
        int q = Integer.parseInt(tokens[1]);
        
        int g = gcd(p, q);
        int t = q / g;
        int k = 1;
        
        if (t % 2 == 0) {
            k *= 2;
            while (t % 2 == 0) {
                t /= 2;
            }
        }
        
        for (int i = 3; i <= Math.sqrt(t) + 1; i += 2) {
            if (t % i > 0) {
                continue;
            }
            k *= i;
            while (t % i == 0) {
                t /= i;
            }
        }
        
        writer.println(t * k);
        writer.flush();
    }
    
    public static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b