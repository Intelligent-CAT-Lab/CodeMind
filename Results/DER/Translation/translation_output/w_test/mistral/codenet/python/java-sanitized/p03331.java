import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1000000000000;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum(i) + sum(N - i));
        }
        System.out.println(ans);
    }

    public static int sum(int n) {
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        return total;
    }
}