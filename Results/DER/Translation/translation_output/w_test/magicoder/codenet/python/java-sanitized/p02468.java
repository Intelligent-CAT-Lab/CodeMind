import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        System.out.println(pow(m, n, mod));
    }

    public static long pow(int base, int exponent, long mod) {
        long result = 1;
        base = base % (int) mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % (int) mod;
        }
        return result;
    }
}