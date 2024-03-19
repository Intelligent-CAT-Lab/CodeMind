import java.util.Scanner;

public class p02713 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int ans = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += gcd(gcd(a, b), c);
                }
            }
        }

        System.out.println(ans);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}