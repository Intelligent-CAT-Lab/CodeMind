import java.util.Scanner;

public class p01637 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int m = Integer.parseInt(inputs[0]);
        int rd = Integer.parseInt(inputs[1]);
        int rr = Integer.parseInt(inputs[2]);
        int cd = Integer.parseInt(inputs[3]);
        int cr = Integer.parseInt(inputs[4]);

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