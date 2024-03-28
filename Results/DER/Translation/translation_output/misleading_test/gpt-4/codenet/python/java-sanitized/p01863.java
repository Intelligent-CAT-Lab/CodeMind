import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;

public class p01863 {
    private static final BigInteger BASE = BigInteger.valueOf(100);
    private static final BigInteger MOD1 = BigInteger.valueOf(1000000007);
    private static final BigInteger MOD2 = BigInteger.valueOf(2147483647);
    private static ArrayList<BigInteger> hlst1 = new ArrayList<>();
    private static ArrayList<BigInteger> hlst2 = new ArrayList<>();
    private static String s;
    private static int length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        length = s.length();
        BigInteger acc1 = BigInteger.ZERO;
        BigInteger acc2 = BigInteger.ZERO;
        hlst