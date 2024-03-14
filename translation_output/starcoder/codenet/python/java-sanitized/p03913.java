import java.util.*;
import java.io.*;

public class p03913 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());

        int ans = Integer.MAX_VALUE;
        for (int K = 1; K <= 50; K++) {
            int n = (int) Math.pow(N,