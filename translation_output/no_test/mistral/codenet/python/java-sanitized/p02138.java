import java.util.*;

public class p02138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans1 = 0;
        int ans2 = 0;
        int n1 = 0;
        int n2 = 0;
        int m1 = 0;
        int m2 = 0;
        int mall = M * 2;
        int nall = N * 2;
        while (true) {
            mall -= n1;
            m1 = -(-mall / 2);
            if (mall <= 0) {
                break;
            }
            ans1++;
            if (n2 - m1 >= 0) {
                n2 -= m1;
            } else {
                n1 = n1 + n2 - m1;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans1++;
        }
        while (true) {
            if (m2 - n1 >= 0) {
                m2 -= n1;
            } else {
                m1 = m1 + m2 - n1;
                m2 = 0;
            }
            if (m1 <= 0) {
                break;
            }
            ans2++;
            nall -= m1;
            n1 = -(-nall / 2);
            if (nall <= 0) {
                break;
            }
            ans2++;
        }
        System.out.println(Math.min(ans1, ans2));
    }
}