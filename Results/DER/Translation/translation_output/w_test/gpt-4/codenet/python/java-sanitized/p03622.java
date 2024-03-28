import java.math.BigInteger;
import java.util.Scanner;

public class p03622 {

    private static final BigInteger M = BigInteger.valueOf(8).pow(7);
    private static final BigInteger MUL_476 = BigInteger.valueOf(476);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    
    public static void main(String[] args) {
        BigInteger m = M.multiply(MUL_476).add(BigInteger.ONE);
        BigInteger[] f = new BigInteger[M.intValue() + 1];
        BigInteger[] g = new BigInteger[M.intValue() + 1];
        f[0] = BigInteger.ONE;
        g[0] = BigInteger.ONE;
        BigInteger i = BigInteger.ONE;

        // Precompute factorial and modulo inverse
        while (i.compareTo(M) == -1) {
            f[i.intValue()] = f[i.intValue() - 1].multiply(i).mod(m);
            i = i.add(BigInteger.ONE);
        }

        g[M.intValue() - 1] = f[M.intValue() - 1].modInverse(m);
        i = BigInteger.valueOf(M.intValue() - 1);
        
        while (i.compareTo(BigInteger.ZERO) > 0) {
            g[i.intValue() - 1] = g[i.intValue()].multiply(i).mod(m);
            i = i.subtract(BigInteger.ONE);
        }

        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        scanner.close();

        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }

        BigInteger result = BigInteger.ZERO;
        BigInteger k = BigInteger.ONE;
        int j = 1;
        while (j <= B) {
            result = result.add(k.multiply(f[A + B - j]).multiply(g[B - j]).mod(m));
            k = k.multiply(TWO).mod(m);
            j++;
        }

        result = (result.multiply(f[B]).multiply(g[A + B]).add(BigInteger.valueOf(A))).mod(m);
        System.out.println(result);
    }
}