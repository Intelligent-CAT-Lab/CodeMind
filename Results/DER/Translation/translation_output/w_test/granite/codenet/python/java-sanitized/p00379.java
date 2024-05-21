import java.util.Scanner;

public class p00379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int ans = 0;
        for (int y = 1; y < 50; y++) {
            int x = (int) Math.pow(y + a, n);
            if (1 <= x && x <= m && y == sumOfDigits(x)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}