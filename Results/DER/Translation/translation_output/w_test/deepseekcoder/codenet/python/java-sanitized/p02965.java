import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02965 {
    static final long MOD = 998244353;
    static long[] factorials;
    static long[] finvs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        factorials = getFactorials(M * 3 / 2 + N, MOD);
        finvs = getInvFactorials(M * 3 / 2 + N, MOD);

        long[] odds = new long[M / 2 + (M % 2)];
        for (int i = 0; i < odds.length; i++) {
            odds[i] = i * 2 + 1;
        }

        long[] oc1 = new long[odds.length];
        long[] oc2 = new long[odds.length];
        for (int i = 0; i < odds.length; i++) {
            oc1[i