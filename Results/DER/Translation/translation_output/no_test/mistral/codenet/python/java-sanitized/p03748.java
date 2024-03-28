import java.io.*;
import java.util.*;

public class p03748 {
    static int MOD = 1000000007;
    static int N, M;
    static long[] dp_T = new long[N + 1];
    static long[] dp_F = new long[N + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 1åº¦ã¯èµ¤ã0åã«ãªããããªåæç¶æ