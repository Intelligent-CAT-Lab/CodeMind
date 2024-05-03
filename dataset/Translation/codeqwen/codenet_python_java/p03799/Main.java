import java.util.Scanner;

public class p03799 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (2 * N <= M) {
            int ans = N + (M - 2 * N) / 4;
            System.out.println(ans);
        } else {
            int ans = M / 2;
            System.out.println(ans);
        }
    }
}