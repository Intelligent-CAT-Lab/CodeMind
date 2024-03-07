import java.util.Scanner;
import java.math.BigInteger;

public class p02170 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();

        BigInteger[] lst = new BigInteger[k + 1];
        lst[k - 1] = BigInteger.ONE;
        BigInteger A = BigInteger.valueOf(a).multiply(BigInteger.valueOf(100 * n).modPow(BigInteger.valueOf(mod - 2), BigInteger.valueOf(mod)));
        BigInteger inv = BigInteger.valueOf(n).modPow(BigInteger.valueOf(mod - 2), BigInteger.valueOf(mod));

        for (int i = k - 2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A.multiply(lst[i + 1].subtract(lst[i + n + 1])).add(lst[i + 1]).mod(BigInteger.valueOf(mod));
            } else {
                lst[i] = A.multiply(lst[i + 1].subtract(lst[k])).add(BigInteger.valueOf(n - (k - i) + 1).multiply(inv)).add(lst[i + 1]).mod(BigInteger.valueOf(mod));
            }
        }

        System.out.println((lst[0].subtract(lst[1])).mod(BigInteger.valueOf(mod)));
    }
}