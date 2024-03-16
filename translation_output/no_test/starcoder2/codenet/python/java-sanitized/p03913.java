import java.util.*;
import java.io.*;

public class p03913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int A = Integer.parseInt(s[1]);

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            int n = (int) Math.pow(N,