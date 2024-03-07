import java.util.Scanner;

public class p02965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
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
            oc2 = (oc2 * factorials[odds[i] - 1]) % M;
        }
        int c1 = 1;
        for (int i = 0; i < halves.length; i++) {
            c1 = (c1 * factorials[halves[i] + N - 1]) % M;
        }
        c1 = (c1 * oc1) % M;