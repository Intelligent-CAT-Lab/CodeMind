import java.io.*;
import java.util.*;

public class p01781 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int Z = Integer.parseInt(input[2]);
        int A = Integer.parseInt(input[3]);
        int B = Integer.parseInt(input[4]);
        int C = Integer.parseInt(input[5]);
        int N = Integer.parseInt(input[6]);

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
                  S[k+1] - S[k-X+A] - S[k-Y+B] - S[k-Z+C] + S[k-(X+Y+Z-A-B-C)]
                + S[k-A] - S[k-X+B] - S[k-Y+C] + S[k-(X+Y+Z-B-C)]
                + S[k-X+A] - S[k-Y+B] - S[k-Z+C] + S[k-(X+Y+Z-A-B-C)]
                + S[k-A] - S[k-X+B] - S[k-Z+C] + S[k-(X+Y+Z-B-C)]
                + S[k-X+A] - S[k-Y+B] - S[k-C] + S[k-(X+Y+Z-A-B-C)]
                + S[k-A] - S[k-X+B] - S[k-C] + S[k-(X+Y+Z-B-C)]
                + S[k-X+A] - S[k-B] - S[k-C] + S[k-(X+Y+Z-A-B-C)]
                + S[k-A] - S[k-B] - S[k-C] + S[k-(X+Y+Z-B-C)]
                + S[k-A] - S[k-B] - S[k-C] + S[k-(X+Y+Z-A-B-C)]
            );
        }

        bw.write(Arrays.toString(ans).replaceAll("\\[|\\]", "").replaceAll(",", "").replaceAll(" ", "\n"));
        bw.newLine();

        bw.close();
        br.close();
    }
}