import java.util.*;
import java.io.*;

public class p01781 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        int[] S = new int[Math.max(2*(X+Y+Z+1), 2*N+2)];
        for (int k = 0; k < N; k++) {
            S[k] = k*(k+1)/2;
        }
        for (int k = N; k < X+Y+Z+1; k++) {
            S[k] = k*(k+1)/2 + S[k-N];
        }

        int calc(int k, int x, int y, int z) {
            return S[k] - S[k-x] - S[k-y] - S[k-z] + S[k-(x+y)] + S[k-(y+z)] + S[k-(z+x)] - S[k-(x+y+z)];
        }

        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X+Y+Z - b - 1) / N * N + b;
            ans[b] = (
                  calc(k+1, X-A, Y-B, Z-C)
                + calc(k, A, Y-B, Z-C)
                + calc(k, X-A, B, Z-C)
                + calc(k, X-A, Y-B, C)
                + calc(k-1, A, B, Z-C)
                + calc(k-1, X-A, B, C)
                + calc(k-1, A, Y-B, C)
                + calc(k-2, A, B, C)
            );
        }
        for (int i = 0; i < N; i++) {
            pw.print(ans[i] + " ");
        }
        pw.println();
        pw.flush();
    }
}