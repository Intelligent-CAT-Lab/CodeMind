import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class codeforces_110_B {
    static int hpop(int[] arr) {
        return arr[0];
    }

    static void hpush(int[] arr, int value) {
        arr[0] = value;
    }

    static int MOD = (int) (Math.pow(10, 9) + 7);

    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(" abcd ".repeat(n / 4)).append(" abc ".substring(0, n % 4));
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        int t = 1;
        for (int i = 0; i < t; i++) {
            solution();
        }
    }
}