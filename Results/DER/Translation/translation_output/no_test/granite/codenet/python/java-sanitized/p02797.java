import java.util.*;
import java.io.*;

public class p02797 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int S = Integer.parseInt(input[2]);
        
        int[] A = new int[N];
        Arrays.fill(A, S);
        if (S == 100000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = 100000000;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(A[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}