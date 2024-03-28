import java.util.Scanner;

public class p03281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            int cnt_divisor = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    cnt_divisor++;
                }
            }
            if (cnt_divisor == 8) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}