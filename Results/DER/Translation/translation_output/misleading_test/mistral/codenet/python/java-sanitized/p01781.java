import java.util.*;
import java.io.*;

public class p01781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int[] input = new int[7];
        String line = br.readLine();
        String[] split = line.split(" ");
        for (int i = 0; i < split.length; i++) {
            input[i] = Integer.parseInt(split[i]);
        }
        int[] S = new int[input[6] + 1];
        Arrays.fill(S, 0);
        for (int i = 0; i < input[4]; i++) {
            S[i] = (i * (i + 1)) / 2;
        }
        for (int i = input[4]; i <= input[6]; i++) {
            S[i] = (i * (i + 1)) / 2 + S[i - input[4]];
        }
        int[] ans = new int[input[4]];
        for (int i = 0; i < input[4]; i++) {
            int k = ((input[6] - i - 1) / input[4] * input[4] + i);
            ans[i] = (
                    calc(k + 1, input[5] - input[0], input[4] - input[1], input[3] - input[2])
                    + calc(k, input[5] - input[0], input[4] - input[1], input[3] - input[2])
                    + calc(k, input[5] - input[0], input[4] - input[1], input[3])
                    + calc(k, input[5] - input[0], input[4] - input[1], input[2])
                    + calc(k - 1, input[5] - input[0], input[4] - input[1], input[2])
                    + calc(k - 1, input[5] - input[0], input[4] - input[1], input[1])
                    + calc(k - 1, input[5] - input[0], input[4] - input[1], input[0])
                    + calc(k - 2, input[5] - input[0], input[4] - input[1], input[0])
            );
        }
        out.println(Arrays.toString(ans));
        out.println();
    }
    public static int calc(int k, int x, int y, int z) {
        return (k * (k + 1) / 2 - k * x - k * y - k * z + k * (x + y) + k * (y + z) + k * (z + x) - k * (x + y + z));
    }
}