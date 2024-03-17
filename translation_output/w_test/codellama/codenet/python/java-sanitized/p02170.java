import java.util.Scanner;
import java.math.BigInteger;

public class p02170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        int[] lst = new int[k + 1];
        lst[k - 1] = 1;
        BigInteger A = BigInteger.valueOf(a).multiply(BigInteger.valueOf(100 * n).modPow(BigInteger.valueOf(n).subtract(BigInteger.valueOf(2)), BigInteger.valueOf(998244353)));
        BigInteger inv = BigInteger.valueOf(n).modPow(BigInteger.valueOf(n).subtract(BigInteger.valueOf(2)), BigInteger.valueOf(998244353));

        for (int i = k - 2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A.multiply(BigInteger.valueOf(lst[i + 1]).subtract(BigInteger.valueOf(lst[i + n + 1]))).add(BigInteger.valueOf(lst[i + 1])).mod(BigInteger.valueOf(998244353));
            } else {
                lst[i] = A.multiply(BigInteger.valueOf(lst[i + 1]).subtract(BigInteger.valueOf(lst[k]))).add(BigInteger.valueOf(n - (k - i) + 1).multiply(inv)).add(BigInteger.valueOf(lst[i + 1])).mod(BigInteger.valueOf(998244353));
            }
        }
        System.out.println((lst[0].subtract(lst[1])).mod(BigInteger.valueOf(998244353)));
    }
}