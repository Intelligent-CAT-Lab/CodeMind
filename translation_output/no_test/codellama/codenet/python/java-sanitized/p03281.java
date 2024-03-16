import java.util.Scanner;

public class p03281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (cntDivisor(i) == 8) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}