import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            System.out.println((n < 3) ? "" : String.join(" ", String.valueOf((i - ~(Math.pow(n % 2 < (i + 2 < n > i * 2) ? 1 : -1, n) + 1)) % n + 1)));
        }
    }
}