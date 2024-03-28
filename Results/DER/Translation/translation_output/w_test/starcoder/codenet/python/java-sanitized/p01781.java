import java.util.*;
import java.io.*;

public class p01781 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X+Y+Z - b - 1) / N * N + b;
            ans[b] = (
                    S[k+1] - S[k-X] - S[k-Y] - S[k-Z] + S[k-(X+Y)] + S[k-(Y+Z)] + S[k-(Z+X)] - S[k-(X+Y+Z)]
                    + S[k] - S[k-A] - S[k-B] - S[k-C] + S[k-(A+B)] + S[k-(B+C)] + S[k-(C+A)] - S[k-(A+B+C)]
                    + S[k-1] - S[k-X-A] - S[k-Y-B] - S[k-Z-C] + S[k-(X+Y+A)] + S[k-(Y+Z+B)] + S[k-(Z+X+C)] - S[k-(X+Y+Z+A+B+C)]
                    + S[k-2] - S[k-X-A-B] - S[k-Y-B-C] - S[k-Z-C-A] + S[k-(X+Y+A+B)] + S[k-(Y+Z+B+C)] + S[k-(Z+X+C+A)] - S[k-(X+Y+Z+A+B+C+A+B)]
            );
        }
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}