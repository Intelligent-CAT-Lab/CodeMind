import java.util.Scanner;

public class p03799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int ans;

        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }

        System.out.println(ans);
    }
}