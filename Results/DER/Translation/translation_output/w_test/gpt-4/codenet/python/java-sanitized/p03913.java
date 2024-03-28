import java.io.*;

public class p03913 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int A = Integer.parseInt(inputs[1]);

        int answer = F(N, A, 1);
        for (int K = 2; K < 50; K++) {
            answer = Math.min(answer, F(N, A, K));
        }

        System.out.println(answer);
    }

    private static int F(int N, int A, int K) {
        // x+y = K
        // n^K <= N < (n+1)^K
        int n = (int)Math.pow(N,