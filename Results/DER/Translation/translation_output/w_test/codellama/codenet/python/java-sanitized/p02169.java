import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

public class p02169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n < k || m < k) {
            System.out.println(0);
            return;
        }
        BigInteger ans = BigInteger.valueOf(m).modPow(n, BigInteger.valueOf(998244353));
        ArrayList<BigInteger> p = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            p.add(BigInteger.valueOf(i).modPow(n, BigInteger.valueOf(998244353)));
        }
        BigInteger c = BigInteger.valueOf(m);
        ArrayList<ArrayList<BigInteger>> comb = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            comb.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    comb.get(i).add(BigInteger.valueOf(1));
                } else {
                    comb.get(i).add(comb.get(i - 1).get(j) + comb.get(i - 1).get(j + 1));
                }
            }
        }
        for (int i = 1; i <= k; i++) {
            BigInteger k = BigInteger.ZERO;
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    k = k.subtract(comb.get(i).get(j).multiply(p.get(j)));
                } else {
                    k = k.add(comb.get(i).get(j).multiply(p.get(j)));
                }
            }
            k = k.multiply(c);
            c = c.multiply(BigInteger.valueOf(m - i));
            c = c.multiply(BigInteger.valueOf(i + 1).modPow(BigInteger.valueOf(998244353 - 2), BigInteger.valueOf(998244353)));
            c = c.mod(BigInteger.valueOf(998244353));
            ans = ans.subtract(k);
            ans = ans.mod(BigInteger.valueOf(998244353));
        }
        System.out.println(ans);
    }
}