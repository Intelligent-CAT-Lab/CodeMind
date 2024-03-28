import java.util.Scanner;

public class p01892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int score = Math.abs(a - b);
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if (b * x % y == 0) {
                    int newA = b * x / y;
                    score = Math.min(score, Math.abs(a - newA));
                }
            }
        }
        System.out.println(score);
    }
}