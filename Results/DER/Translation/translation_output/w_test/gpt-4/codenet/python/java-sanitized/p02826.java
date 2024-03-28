import java.math.BigInteger;
import java.util.Scanner;

public class p02826 {

    private static BigInteger MOD;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        MOD = BigInteger.valueOf(scanner.nextLong());

        // Sample implementation of fft_convolve, cumprod, and other operations
        // are not providded.