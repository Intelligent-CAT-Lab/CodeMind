import java.util.Scanner;

class Main {
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long result = power(k, n, MOD);
        System.out.println(result);
    }

    private static long power(int base, int exponent, int mod) {
        long result = 1;
        long x = base;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            exponent /= 2;
        }

        return result;
    }
}