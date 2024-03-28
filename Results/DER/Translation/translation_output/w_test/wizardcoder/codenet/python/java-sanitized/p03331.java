import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int ans = 1000000000000;
        for (int i = 1; i < N; i++) {
            int sum1 = sum(i);
            int sum2 = sum(N - i);
            ans = Math.min(ans, sum1 + sum2);
        }

        System.out.println(ans);
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}