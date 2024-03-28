import java.util.Scanner;
import java.math.BigInteger;

public class p04046 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int MOD = 1000000007;

        BigInteger[] factorial = new BigInteger[H+W+1];
        BigInteger[] invFactorial = new BigInteger[H+W+1];

        factorial[0] = BigInteger.ONE;
        invFactorial[0] = BigInteger.ONE;

        for (int i = 1; i <= H+W; i++) {
            factorial[i] = factorial[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            invFactorial[i] = factorial[i].modInverse(BigInteger.valueOf(MOD));
        }

        BigInteger answer = BigInteger.ZERO;

        for (int i = B+1; i <= W; i++) {
            BigInteger f1 = factorial[H-A+i-1].multiply(invFactorial[H-A]).mod(BigInteger.valueOf(MOD));
            BigInteger f2 = factorial[A+W-i].multiply(invFactorial[A]).mod(BigInteger.valueOf(MOD));
            answer = answer.add(f