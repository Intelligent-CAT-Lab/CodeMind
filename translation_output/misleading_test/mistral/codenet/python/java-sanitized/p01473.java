import java.util.Scanner;
import java.math.BigInteger;

public class p01473 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int[] d = new int[256];
        for (int i = 0; i < len; i++) {
            d[s.charAt(i)]++;
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += d[i] % 2;
        }
        if (len % 2 == 0 && sum != 0) {
            System.out.println(0);
        } else if (len % 2 == 1 && sum != 1) {
            System.out.println(0);
        } else {
            BigInteger fact = BigInteger.ONE;
            for (int i = 1; i < len / 2 + 1; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact.divide(BigInteger.valueOf(len / 2)).intValue());
        }
    }
}