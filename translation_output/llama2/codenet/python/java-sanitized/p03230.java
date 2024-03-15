import java.util.Scanner;

public class p03230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = 0;
        for (int i = 1; i < 1000000; i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }
        if (K == 0) {
            System.out.println("No");
            return;
        }
        int[][] S = new int[K][];
        int cnt = 0;
        int k = 0;
        for (int i = 1; i <= N; i++) {
            S[k].add(i);
            cnt++;
            if (cnt == K - (k + 1)) {
                k++;
                cnt = 0;
            }
        }
        int col = 0;
        int j = 1;
        int k = 1;
        cnt = 0;
        while (j <= N) {
            S[k].add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col + 1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }
        System.out.println("Yes");
        System.out.println(K);
        for (int[] s : S) {
            System.out.println(K - 1 + " " + s);
        }
    }
}