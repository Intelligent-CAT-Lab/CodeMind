import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mod = (int) (Math.pow(10, 9) + 7);
        System.out.println(power(m, n, mod));
    }

    public static long power(int m, int n, int mod) {
        return pow(m, n, mod);
    }

    public static long pow(int base, int exp, int mod) {
        if (exp == 0) {
            return 1;
        } else if (exp % 2 == 0) {
            long half = pow(base, exp / 2, mod) % mod;
            return (half * half) % mod;
        } else {
            long half = pow(base, exp / 2, mod) % mod;
            return ((half * half) % mod * base) % mod;
        }
    }
}