import java.io.*;
import java.util.*;

public class p03913 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int answer = Integer.MAX_VALUE;

        for (int K = 1; K < 50; K++) {
            answer = Math.min(answer, F(N, A, K));
        }
        System.out.println(answer);
    }

    private static int F(int N, int A, int K) {
        // x+y = K
        // n^K <= N < (n+1)^K
        int n = (int)Math.pow(N,