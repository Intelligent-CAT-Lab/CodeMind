import java.util.Scanner;

public class p01637 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int rd = Integer.parseInt(input[1]);
        int rr = Integer.parseInt(input[2]);
        int cd = Integer.parseInt(input[3]);
        int cr = Integer.parseInt(input[4]);

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex += 1;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey += 1;
        }
        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}