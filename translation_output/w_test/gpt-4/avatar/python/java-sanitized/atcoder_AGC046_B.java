import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        int m = 998244353;
        long[][] d = new long[C + 1][D + 1];
        d[A][B] = 1;

        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                if (!(i == A && j == B)) { // to avoid modifying d[A][B]
                    d[i][j] = ((d[i][j - 1] * i
                             + d[i - 1][j] * j
                             - d[i - 1][j - 1] * (i - 1) * (j - 1)) % m + m) % m; // to ensure the result is not negative
                }
            }
        }

        System.out.println(d[C][D]);
    }
}