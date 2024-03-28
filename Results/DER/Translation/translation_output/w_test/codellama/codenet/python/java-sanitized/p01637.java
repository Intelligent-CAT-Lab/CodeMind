import java.util.Scanner;

public class p01637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int m = Integer.parseInt(tokens[0]);
        int rd = Integer.parseInt(tokens[1]);
        int rr = Integer.parseInt(tokens[2]);
        int cd = Integer.parseInt(tokens[3]);
        int cr = Integer.parseInt(tokens[4]);

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex += 1;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey += 1;
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