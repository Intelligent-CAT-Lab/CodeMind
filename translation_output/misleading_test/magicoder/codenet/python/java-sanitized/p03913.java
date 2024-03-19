import java.util.*;

public class p03913 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();

        long answer = Long.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            answer = Math.min(answer, F(N, A, K));
        }
        System.out.println(answer);
    }

    private static long F(long N, long A, int K) {
        long n = (long) Math.pow(N,