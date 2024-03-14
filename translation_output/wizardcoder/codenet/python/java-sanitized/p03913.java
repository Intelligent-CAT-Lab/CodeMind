import java.io.*;
import java.util.*;

public class p03913 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, A;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        A = Integer.parseInt(input[1]);

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K <= 50; K++) {
            int n = (int) Math.pow(N,