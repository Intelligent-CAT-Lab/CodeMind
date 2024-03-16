import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class codeforces_203_A {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder out = new StringBuilder();

    static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    static int[] readInts() throws IOException {
        String[] s = in.readLine().split(" ");
        int[] res = new int[s.length];
        for (int i = 0; i < s.length; i++)
            res[i] = Integer.parseInt(s[i]);
        return res;
    }

    public static void main(String[] args) throws IOException {
        int[] input = readInts();
        int d = input[0], t = input[1], a = input[2], b = input[3], da = input[4], db = input[5];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    out.append("YES\n");
                    System.out.print(out);
                    return;
                }
            }
        }
        out.append("NO\n");
        System.out.print(out);
    }
}