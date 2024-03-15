import java.math.BigInteger;
import java.util.Scanner;

public class p01863 {
    private static final int BASE = 100;
    private static final BigInteger MOD1 = BigInteger.valueOf(1000000007);
    private static final BigInteger MOD2 = BigInteger.valueOf(2147483647);
    private static BigInteger[] hlst1;
    private static BigInteger[] hlst2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        BigInteger acc1 = BigInteger.ZERO;
        BigInteger acc2 = BigInteger.ZERO;
        hlst1 = new BigInteger[length + 1];
        hlst2 = new BigInteger[length + 1];
        hlst1[0] = BigInteger.ZERO;
        hlst2[0] = BigInteger.ZERO;

        for (int j = 0; j < length; j++) {
            char c = s.charAt(j);
            int i = c;
            acc1 = acc