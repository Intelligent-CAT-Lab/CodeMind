import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int ans = 1000000000000;
        for (int i = 1; i < N; i++) {
            int sum1 = 0, sum2 = 0;
            int x = i, y = N - i;
            while (x > 0) {
                sum1 += x % 10;
                x = x / 10;
            }
            while (y > 0) {
                sum2 += y % 10;
                y = y / 10;
            }
            ans = Math.min(ans, sum1 + sum2);
        }

        System.out.println(ans);
    }
}