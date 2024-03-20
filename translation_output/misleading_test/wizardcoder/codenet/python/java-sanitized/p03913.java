import java.io.*;
import java.util.*;

public class p03913 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K <= 50; K++) {
            int cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }

        bw.write(answer + "\n");
        bw.close();
    }

    public static int F(int N, int A, int K) {
        int n = (int) Math.pow(N,