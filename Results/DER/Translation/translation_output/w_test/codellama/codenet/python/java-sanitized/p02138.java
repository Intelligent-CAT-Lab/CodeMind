import java.util.Scanner;

public class p02138 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int n2 = N * 1;
        int n1 = N * 1;
        int m1 = M * 1;
        int mall = M * 2;

        int ans1 = 0;
        while (true) {
            mall -= n1;
            m1 = -(-mall / 2);

            if (mall <= 0) {
                break;
            }
            ans1 += 1;

            if (n2 - m1 >= 0) {
                n2 -= m1;
            } else {
                n1 = n1 + n2 - m1;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans1 += 1;
        }

        int ans2 = 0;
        n2 = N * 1;
        n1 = N * 1;
        m1 = M * 1;
        m2 = M * 1;
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
            ans2 += 1;

            nall -= m1;
            n1 = -(-nall / 2);

            if (nall <= 0) {
                break;
            }
            ans2 += 1;
        }

        System.out.println(Math.min(ans1, ans2));
    }
}