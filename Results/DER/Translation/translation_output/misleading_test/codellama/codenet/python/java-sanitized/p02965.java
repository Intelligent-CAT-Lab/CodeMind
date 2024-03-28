import java.io.*;
import java.util.*;

public class p02965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        int[] factorials = new int[M * 3 / 2 + N];
        int[] finvs = new int[M * 3 / 2 + N + 1];
        int p = 1;
        for (int i = 0; i < M * 3 / 2 + N; i++) {
            factorials[i] = p;
            p = (p * (i + 1)) % M;
        }
        for (int i = 0; i < M * 3 / 2 + N + 1; i++) {
            finvs[i] = p;
            p = (p * (i + 1)) % M;
        }

        int[] odds = new int[M % 2];
        for (int i = 0; i < M % 2; i++) {
            odds[i] = i * 2 + 1;
        }
        int[] halves = new int[M - odds.length];
        for (int i = 0; i < M - odds.length; i++) {
            halves[i] = i * 2 + 1;
        }

        int oc1 = 1;
        for (int i = 0; i < odds.length; i++) {
            oc1 = (oc1 * factorials[odds[i]]) % M;
        }
        int oc2 = 1;
        for (int i = 0; i < odds.length - 1; i++) {
            oc2 = (oc2 * factorials[odds[i] - 1]) % M