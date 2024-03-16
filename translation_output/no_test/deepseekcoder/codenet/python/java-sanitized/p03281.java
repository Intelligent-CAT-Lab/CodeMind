import java.util.Scanner;

public class p03281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {
                if (cntDivisor(j) == 8) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}