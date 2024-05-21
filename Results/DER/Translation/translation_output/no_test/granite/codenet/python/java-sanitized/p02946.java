import java.util.*;
import java.io.*;

class Main {
    static long MOD = 1000000007;
    static long[] fact;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        for (int i = Math.max(X-K+1, -1000000); i < Math.min(X+K+1, 1000001); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}