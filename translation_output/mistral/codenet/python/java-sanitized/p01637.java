public class p01637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, rd, rr, cd, cr;
        m = sc.nextInt();
        rd = sc.nextInt();
        rr = sc.nextInt();
        cd = sc.nextInt();
        cr = sc.nextInt();
        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex++;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey++;
        }
        System.out.println(m - ex - ey);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}