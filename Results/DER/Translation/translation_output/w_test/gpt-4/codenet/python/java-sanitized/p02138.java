import java.util.Scanner;

public class p02138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int n2 = N;
        int n1 = N;
        int m1 = M;
        int mall = M * 2;

        // うくをほろぼす
        int ans1 = 0;
        while (true) {
            mall -= n1;
            m1 = (int) Math.ceil((double) mall / 2);

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

        // ushiを滅ぼす
        int ans2 = 0;
        n2 = N;
        n1 = N;
        m1 = M;
        int m2 = M;
        mall = M * 2;
        int nall = N * 2;

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
            n1 = (int) Math.ceil((double) nall / 2);

            if (nall <= 0) {
                break;
            }
            ans2++;
        }

        System.out.println(Math.min(ans1, ans2));

        scanner.close();
    }
}