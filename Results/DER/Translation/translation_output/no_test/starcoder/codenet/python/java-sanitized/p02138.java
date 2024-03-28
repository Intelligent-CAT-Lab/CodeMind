import java.util.*;
public class p02138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int n1 = N;
        int n2 = N;
        int m1 = M;
        int m2 = M;
        int ans1 = 0;
        int ans2 = 0;
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
            ans1++;
            n2 -= m1;
            if (n2 <= 0) {
                n1 = n1 + n2;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans1++;
        }
        while (true) {
            if (n2 - m1 >= 0) {
                n2 -= m1;
            } else {
                n1 = n1 + n2 - m1;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans2++;
            m2 -= n1;
            if (m2 <= 0) {
                m1 = m1 + m2;
                m2 = 0;
            }
            if (m1 <= 0) {
                break;
            }
            ans2++;
        }
        System.out.println(Math.min(ans1, ans2));
    }
}