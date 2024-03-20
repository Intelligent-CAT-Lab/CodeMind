

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MOD = 998244353;
        int[] factorials = new int[M * 3 / 2 + N + 1];
        int[] finvs = new int[M * 3 / 2 + N + 1];
        factorials[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
        }
        finvs[factorials.length - 1] = 1;
        for (int i = factorials.length - 2; i >= 0; i--) {
            finvs[i] = finvs[i + 1] * (i + 1) % MOD;
        }
        int[] odds = new int[M / 2 + 1];
        for (int i = 0; i < odds.length; i++) {
            odds[i] = i * 2 + 1;
        }
        int[] halves = new int[M / 2 + 1];
        for (int i = 0; i < halves.length; i++) {
            halves[i] = M - odds[i];
        }
        int[] oc1 = new int[M / 2 + 1];
        int[] oc2 = new int[M / 2 + 1];
        for (int i = 0; i < oc1.length; i++) {
            oc1[i] = factorials[N] * finvs[odds[i]] % MOD * finvs[N - odds[i]] % MOD;
            oc2[i] = factorials[N - 1] * finvs[odds[i]] % MOD * finvs[N - 1 - odd
