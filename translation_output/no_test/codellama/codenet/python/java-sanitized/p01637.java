import java.util.Scanner;

public class p01637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rd = sc.nextInt();
        int rr = sc.nextInt();
        int cd = sc.nextInt();
        int cr = sc.nextInt();

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex++;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey++;
        }
        int result = m - ex - ey;
        if (result < 0) {
            result = -1;
        }
        System.out.println(result);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}