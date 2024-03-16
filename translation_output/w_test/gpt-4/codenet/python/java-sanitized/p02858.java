import java.util.Scanner;
import java.math.BigInteger;

public class p02858 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextLong();
        long W = scanner.nextLong();
        long T = scanner.nextLong();
        
        long gh = gcd(H, T);
        long gw = gcd(W, T);
        long h = H / gh;
        long w = W / gw;

        final BigInteger MOD = BigInteger.valueOf(1000000007);
        
        // Using BigInteger for modPow and subtract methods
        BigInteger result = BigInteger.valueOf(2).modPow(BigInteger.valueOf(h), MOD)
                                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(w), MOD))
                                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(gcd(h, w)), MOD))
                                .subtract(BigInteger.valueOf(3))
                                .modPow(BigInteger.valueOf(gh * gw), MOD);
        
        System.out.println(result.mod(MOD).toString());
        scanner.close();
    }
    
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}