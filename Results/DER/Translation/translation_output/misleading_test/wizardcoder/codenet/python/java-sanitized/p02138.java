import java.util.Scanner;

public class p02138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        int n = arr[0];
        int m = arr[1];
        int ans1 = 0, ans2 = 0;
        int n1 = n, n2 = n, m1 = m, m2 = m, nall = n * 2, mall = m * 2;
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
        System.out.println(Math.min(ans1, ans2));
    }
}