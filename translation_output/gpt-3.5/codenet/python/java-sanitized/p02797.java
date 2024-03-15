import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int S = Integer.parseInt(input[2]);

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = S;
        }

        if (S == (int) 1e9) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = (int) 1e9;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}