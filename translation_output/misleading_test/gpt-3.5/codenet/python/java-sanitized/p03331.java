import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int ans = 1000000000;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumN(i) + sumN(N - i));
        }

        System.out.println(ans);
    }

    public static int sumN(int N) {
        int total = 0;
        int x = N;
        while (x > 0) {
            total += x % 10;
            x = x / 10;
        }
        return total;
    }
}