import java.util.Scanner;

public class p02331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MOD = (int) (Math.pow(10, 9) + 7);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * k) % MOD;
        }

        System.out.println(result);
    }
}