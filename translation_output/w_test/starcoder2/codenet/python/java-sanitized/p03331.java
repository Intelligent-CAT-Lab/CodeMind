import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1000000000;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum_N(i) + sum_N(N - i));
        }
        System.out.println(ans);
    }

    public static int sum_N(int N) {
        int total = 0;
        int x = N;
        while (x > 0) {
            total += x % 10;
            x = x / 10;
        }
        return total;
    }
}