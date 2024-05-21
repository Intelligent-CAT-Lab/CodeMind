import java.util.Scanner;

public class p04041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int m = (int) Math.pow(2, X + Y + Z);
        int[] S = new int[m];
        S[0] = 1;
        int L = Math.max(X, Y, Z);
        int Z0 = (int) Math.pow(2, Z - 1);
        int Y0 = (int) Math.pow(2, Z + Y - 1);
        int X0 = (int) Math.pow(2, X + Z + Y - 1);
        for (int i = 0; i < m; i++) {
            if ((i & Z0) != 0 && (i & Y0) != 0 && (i & X0) != 0) {
                continue;
            }
            int b = (i << 1) | 1;
            for (int k = 1; k <= L; k++) {
                int t = (b << (k - 1)) & (m - 1);
                S[t] = (S[t] + S[i]) % 1000000007;
            }
            for (int k = L + 1; k <= 10; k++) {
                S[0] = (S[0] + S[i]) % 1000000007;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if ((i & Z0) != 0 && (i & Y0) != 0 && (i & X0) != 0) {
                continue;
            }
            ans = (ans + S[i]) % 1000000007;
        }
        ans = (int) (Math.pow(