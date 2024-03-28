import java.util.Scanner;

public class p02331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long MOD = 1000000007;
        long result = (long) Math.pow(k, n) % MOD;

        System.out.println(result);
    }
}