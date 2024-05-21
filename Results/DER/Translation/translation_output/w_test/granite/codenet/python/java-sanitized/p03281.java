import java.util.Scanner;

public class p03281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            int divisorCount = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount == 8) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}