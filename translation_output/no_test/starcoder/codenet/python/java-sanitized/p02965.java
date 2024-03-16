import java.util.*;
import java.io.*;

public class p02965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MOD = 998244353;
        int[] factorials = new int[M * 3 / 2 + N + 1];
        int[] finvs = new int[M * 3 / 2 + N + 1];
        factorials[0] = 1;
        finvs[0] = 1;
        for (int i = 1; i <= M * 3 / 2 + N; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
            finvs[i] = finvs[i - 1] * i % MOD;
        }
        finvs[0] = finvs[M * 3 / 2 + N];
        for (int i = 1; i <= M * 3 / 2 + N; i++) {
            finvs[i] = finvs[i] * finvs[i - 1] % MOD;
        }
        int[] odds = new int[M];
        for (int i = 0; i < M; i++) {
            odds[i] = i * 2 + 1;
        }
        int[] halves = new int[M];
        for (int i = 0; i < M; i++) {
            halves[i] = (M * 3 - odds[i]) / 2;
        }
        int[] oc1 = new int[M];
        int[] oc2 = new int[M];
        for (int i = 0; i < M; i++) {
            oc1[i] = factorials[N] * finvs[odds[i]] % MOD * finvs[N - odds[i]] % MOD;
            oc2[i] = factorials[N - 1] * finvs[odds[i]] % MOD * finvs[N - 1 - odds[i]] % MOD;
        }
        int[] c1 = new int