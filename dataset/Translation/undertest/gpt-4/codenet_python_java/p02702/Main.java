import java.math.BigInteger;
import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] remain = new int[2020];
        BigInteger now = BigInteger.ZERO;
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            now = now.add(new BigInteger(s.substring(i, i + 1)).multiply(
                    BigInteger.TEN.pow(s.length() - i - 1)).mod(BigInteger.valueOf(2019)));
            int nowMod2019 = now.mod(BigInteger.valueOf(2019)).intValue();
            ans += remain[nowMod2019];
            remain[nowMod2019]++;
        }

        ans += remain[0];

        System.out.println(ans);
        sc.close();
    }
}