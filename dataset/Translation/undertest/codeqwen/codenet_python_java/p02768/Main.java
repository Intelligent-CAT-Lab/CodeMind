import java.util.Scanner;
import java.math.BigInteger;

public class p02768 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        BigInteger MOD = BigInteger.valueOf(1000000007);

        BigInteger X = BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);
        BigInteger A = modcomb(n, a, MOD);
        BigInteger B = modcomb(n, b, MOD);
        BigInteger ans = X.subtract(A).subtract(B).mod(MOD);
        System.out.println(ans);
    }

    public static BigInteger modcomb(int n, int a, BigInteger mod) {
        BigInteger cnt = BigInteger.ONE;
        for (int i = 0; i < a; i++) {
            cnt = cnt.multiply(BigInteger.valueOf(n - i)).mod(mod);
            cnt = cnt.multiply(BigInteger.valueOf(i + 1).modPow(mod.subtract(BigInteger.ONE), mod)).mod(mod);
        }
        return cnt;
    }
}