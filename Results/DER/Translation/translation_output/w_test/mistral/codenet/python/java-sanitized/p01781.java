import java.util.*;
import java.io.*;

public class p01781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] split = input.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int[] S = new int[arr.length];
        Arrays.fill(S, 0);
        for (int i = 0; i < arr.length; i++) {
            S[i] = (i * (i + 1)) / 2;
        }
        for (int i = arr.length; i < arr.length + 3; i++) {
            S[i] = (i * (i + 1)) / 2 + S[i - arr.length];
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int k = (arr.length + arr[0] + arr[1] + arr[2] - i - 1) / arr.length * arr.length + i;
            ans[i] = (
                    calc(k + 1, arr[3] - arr[0], arr[4] - arr[1], arr[5] - arr[2])
                + calc(k, arr[0], arr[4] - arr[1], arr[5] - arr[2])
                + calc(k, arr[3] - arr[0], arr[1], arr[5] - arr[2])
                + calc(k, arr[3] - arr[0], arr[4] - arr[1], arr[2])
                + calc(k - 1, arr[0], arr[1], arr[2])
                + calc(k - 1, arr[3] - arr[0], arr[1], arr[2])
                + calc(k - 1, arr[0], arr[4] - arr[1], arr[2])
                + calc(k - 2, arr[0], arr[1], arr[2])
            );
        }
        out.println(Arrays.toString(ans));
        out.println();
    }
    public static int calc(int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }
}