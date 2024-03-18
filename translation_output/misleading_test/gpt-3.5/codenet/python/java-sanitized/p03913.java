import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p03913 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, A;
        
        try {
            String[] input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            A = Integer.parseInt(input[1]);

            int answer = solve(N, A);
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solve(int N, int A) {
        int minCost = Integer.MAX_VALUE;

        for (int K = 1; K < 50; K++) {
            int cost = F(N, A, K);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    public static int F(int N, int A, int K) {
        int n = (int) Math.pow(N,