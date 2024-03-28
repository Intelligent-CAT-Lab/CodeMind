import java.util.Scanner;
import java.math.BigInteger;

public class p01863 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        final BigInteger BASE = BigInteger.valueOf(100);
        final BigInteger MOD1 = BigInteger.valueOf(1000000007);
        final BigInteger MOD2 = BigInteger.valueOf(2147483647);
        BigInteger acc1 = BigInteger.ZERO;
        BigInteger acc2 = BigInteger.ZERO;
        BigInteger[] hlst1 = new BigInteger[length + 1];
        BigInteger[] hlst2 = new BigInteger[length + 1];
        hlst1[0] = BigInteger.ZERO;
        hlst2[0] = BigInteger.ZERO;
        for (int i = 0; i < length; i++) {
            BigInteger c = BigInteger.valueOf((int) s.charAt(i));
            acc1 = acc