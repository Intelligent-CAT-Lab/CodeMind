import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = 1000000007;

        System.out.println(modularExponentiation(m, n, mod));
        sc.close();
    }

    private static long modularExponentiation(int base, int exponent, int modulus) {
        long result = 1;
        base = base % modulus;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }

            base = (long) base * base % modulus;
            exponent /= 2;
        }

        return result;
    }
}