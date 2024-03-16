import java.util.Scanner;

public class p00514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        int a = Math.max(n - 1, r - m * n);
        int b = Math.min(n - 1, r - m * n);
        int d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }
        int u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }
        System.out.println(0 < a ? u / d : 0);
    }
}