import java.util.Scanner;
import java.math.BigInteger;

public class p02334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        BigInteger MOD = BigInteger.valueOf(1000000007);
        
        BigInteger p = BigInteger.ONE;
        BigInteger q = BigInteger.ONE;
        
        for (int i = 0; i < N; i++) {
            p = p.multiply(BigInteger.valueOf(N + K - 1 - i)).mod(MOD);
            q = q.multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }
        
        BigInteger result = p.multiply(q.modInverse(MOD)).mod(MOD);
        
        System.out.println(result);
    }
}