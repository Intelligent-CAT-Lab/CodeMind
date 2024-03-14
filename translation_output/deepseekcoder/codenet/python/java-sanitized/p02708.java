import java.util.Scanner;

public class p02708 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += (((long)(2 * n - i + 1) * i) / 2) - ((long)i * (i - 1) / 2) + 1;
        }
        System.out.println(ans % (long)(Math.pow(10, 9) + 7));
    }
}