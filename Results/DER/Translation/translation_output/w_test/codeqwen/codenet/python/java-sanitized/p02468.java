import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(pow(m, n, mod));
    }

    public static int pow(int m, int n, int mod) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return pow(m * m % mod, n / 2, mod);
        } else {
            return m * pow(m * m % mod, (n - 1) / 2, mod) % mod;
        }
    }
}