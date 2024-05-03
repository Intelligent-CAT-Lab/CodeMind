import java.util.*;
import java.lang.*;

public class p04041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int m = (int) Math.pow(2, X + Y + Z);
        int[] S = new int[m];
        int L = Math.max(X, Y, Z);
        Set<Integer> ss = new HashSet<>();
        Set<Integer> tt = new HashSet<>();
        int Z0 = (int) Math.pow(2, Z - 1);
        int Y0 = (int) Math.pow(2, Z + Y - 1);
        int X0 = (int) Math.pow(2, X + Z + Y - 1);
        for (int i = 0; i < m; i++) {
            if ((i & Z0) != 0 && (i & Y0) != 0 && (i & X0) != 0) {
                ss.add(i);
            }
        }
        int MASK = (int) Math.pow(2, X + Y + Z) - 1;
        int MOD = 1000000007;
        S[0] = 1;
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int s : ss) {
                continue;
            }
            int b = (s << 1) | 1;
            for (int k = 1; k <= L; k++) {
                int t = (b << (k - 1)) & MASK;
                T[t] = (T[t] + S[s]) % MOD;
            }
            for (int k = L + 1; k <= 10; k++) {
                T[0] = (T[0] + S[s]) % MOD;
            }
            S =