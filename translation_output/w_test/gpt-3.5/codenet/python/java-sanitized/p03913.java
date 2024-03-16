import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            int cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }

        System.out.println(answer);
    }

    public static int F(int N, int A, int K) {
        int n = (int) Math.pow(N,