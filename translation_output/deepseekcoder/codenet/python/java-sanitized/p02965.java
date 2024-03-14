import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class p02965 {
    static final int MOD = 998244353;
    static long[] factorials;
    static long[] finvs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (System.getenv("LOCAL") != null) {
            br = new BufferedReader(new FileReader("_in.txt"));
        }

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        factorials = getFactorials(M * 3 / 2 + N, MOD);
        finvs = getInvFactorials(M * 3 / 2 + N, MOD);

        long[] odds = new long[M / 2 + (M % 2)];
        for (int i = 0; i < odds.length; i++) {
            odds[i] = i * 2 + 1;
        }

        long[] oc1 = new long[odds.length];
        long[] oc2 = new long[odds.length];
        for (int i = 0; i