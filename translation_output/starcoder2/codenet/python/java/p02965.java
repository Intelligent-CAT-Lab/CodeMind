
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 998244353;
    static final int MAX = 1000000;
    static long[] factorials;
    static long[] finvs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        factorials = new long[MAX * 3 / 2 + N + 1];
        finvs = new long[MAX * 3 / 2 + N + 1];
        factorials[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
        }
        finvs[factorials.length - 1] = modPow(factorials[factorials.length - 1], MOD - 2);
        for (int i = factorials.length - 2; i >= 0; i--) {
            finvs[i] = finvs[i + 1] * (i + 1) % MOD;
        }

        long[] odds = new long[M / 2 + 1];
        for (int i = 0; i < odds.length; i++) {
            odds[i] = 2 * i + 1;
        }
        long[] halves = new long[M / 2 + 1];
        for (int i = 0; i < halves.length; i++) {
            halves[i] = M - odds[i];
        }

        long[] oc1 = new long[M / 2 + 1];
        long[] oc2 = new long[M / 2 + 1];
        for (int i = 0; i < oc1.length; i++) {
            oc
