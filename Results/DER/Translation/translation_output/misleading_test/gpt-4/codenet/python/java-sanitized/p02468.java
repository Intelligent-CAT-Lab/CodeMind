import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        int mod = 1000000007;

        System.out.println(modularExponentiation(m, n, mod));
    }

    // Function to perform modular exponentiation
    private static long modularExponentiation(int base, int exponent, int modulus) {
        long result = 1;
        long b = base % modulus;

        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                result = (result * b) % modulus;
            }
            exponent >>= 1;
            b = (b * b) % modulus;
        }

        return result;
    }
}