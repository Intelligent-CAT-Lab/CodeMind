import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03331 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int readInt() throws IOException {
        if (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine().trim());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();

        long ans = Long.MAX_VALUE; // equivalent to 1000000000000L in Python code
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum_N(i) + sum_N(N - i));
        }

        System.out.println(ans);
    }

    public static int sum_N(int number) {
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number = number / 10;
        }
        return total;
    }
}