import java.util.Scanner;

public class p03723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        int fa = a;
        int fb = b;
        int fc = c;
        while (true) {
            if (cnt != 0 && fa == a && fb == b && fc == c) {
                System.out.println(-1);
                System.exit(0);
            }
            double tmp1 = a / 2;
            double tmp2 = b / 2;
            double tmp3 = c / 2;
            if (!isDouble(tmp1, tmp2, tmp3)) {
                break;
            }
            cnt++;
            a = (int) (tmp2 + tmp3);
            b = (int) (tmp1 + tmp3);
            c = (int) (tmp1 + tmp2);
            if (!rem(a, b, c)) {
                break;
            }
        }
        System.out.println(cnt);
    }

    public static boolean rem(int a, int b, int c) {
        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDouble(double a, double b, double c) {
        if (a % 1 != 0 || b % 1 != 0 || c % 1 != 0) {
            return false;
        } else {
            return true;
        }
    }
}