import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int m = 998244353;

        int[][] d = new int[C + 1][D + 1];
        d[A][B] = 1;

        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                if (i != A || j != B) { // Skip the initial cell
                    d[i][j] += (d[i][j - 1] * (long)i + d[i - 1][j] * (long)j - d[i - 1][j - 1] * (long)(i - 1) * (j - 1)) % m;
                    if (d[i][j] < 0) d[i][j] += m; // Ensure non-negative value
                }
            }
        }

        System.out.println(d[C][D]);
        sc.close();
    }
}