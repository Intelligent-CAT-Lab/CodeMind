import java.util.*;

public class p03913 {
    static long N, A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        A = sc.nextLong();
        long answer = Long.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            answer = Math.min(answer, F(K));
        }
        System.out.println(answer);
    }

    static long F(int K) {
        long n = (long)Math.sqrt(N);
        while ((n-1)*n*K < N) {
            n++;
        }
        while (n*(n+1)*K >= N) {
            n--;
        }
        long cost = A*(K-1) + n*K + (n+1)*K;
        for (int y = 0; y < K; y++) {
            int x = K - y;
            if (Math.pow(n, x) * Math.pow(n+1, y) >= N) {
                cost = A*x + n*x + (n+1)*y;
                break;
            }
        }
        return cost;
    }
}