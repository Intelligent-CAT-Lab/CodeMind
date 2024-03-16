import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p03913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = br.readLine().split(" ");
        int N = Integer.parseInt(inputLine[0]);
        int A = Integer.parseInt(inputLine[1]);

        int answer = Integer.MAX_VALUE;

        for (int K = 1; K <= 50; K++) {
            int cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }

        System.out.println(answer);
    }

    public static int F(int N, int A, int K) {
        int n = (int) Math.pow(N,