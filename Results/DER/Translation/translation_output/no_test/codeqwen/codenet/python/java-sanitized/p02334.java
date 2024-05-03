import java.util.Scanner;
import java.math.BigInteger;

public class p02334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        BigInteger MOD = BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7));

        BigInteger p = BigInteger.ONE;
        BigInteger q = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            p = p.multiply(BigInteger.valueOf(N + K - 1 - i)).mod(MOD);
            q = q.multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }

        System.out.println(p.multiply(q.modInverse(MOD)).mod(MOD));
    }
}