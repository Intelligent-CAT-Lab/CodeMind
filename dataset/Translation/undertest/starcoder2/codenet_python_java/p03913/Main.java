import java.util.*;

public class p03913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();

        long answer = Long.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            long cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }
        System.out.println(answer);
    }

    static long F(long N, long A, int K) {
        long n = (long) Math.pow(N,