import java.util.Scanner;

public class p00007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}