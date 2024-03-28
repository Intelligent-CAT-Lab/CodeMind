public class p01425 {
    private static final double eps = 1e-10;
    private static final double g = 9.8;

    public static boolean check(int x, int y) {
        if (x == 0) {
            return false;
        }
        int a = (int) (g * g / 4);
        int b = (y * g - V * V);
        int c = x * x + y * y;
        double D = (double) b * b - 4 * a * c;
        if (D < -eps) {
            return false;
        }
        if (-eps <= D < 0) {
            D = 0;
        }
        for (int d = -1; d <= 1; d++) {
            double tt = ((double) b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            int vx = x / t;
            int vy = y / t + g * t / 2;
            if (calc(vy, x / vx) < y - eps) {
                return false;
            }
            for (int l : obstacles) {
                int B = l[1];
                int T = l[3];
                int L = l[0];
                int R = l[2];
                int xh = cmp(L, R, vx * (vy / g));
                int yh = cmp(B, T, calc(vy, vy / g));
                if (l[0] * l[1] <= 0 || !xh && yh * l[1] <= 0) {
                    break;
                }
            }
            if (1 == 1) {
                return true;
            }
        }
        return false;
    }

    public static int calc(int vy, int t) {
        return vy * t - g / 2 * t * t;
    }

    public static int cmp(int lb, int ub, int x) {
        if (x < lb + eps) {
            return -1;
        }
        if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int[][] obstacles = new int[N][4];
        for (int i = 0; i < N; i++) {
            obstacles[i] = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        }
        if (check(X, Y)) {
            System.out.println("Yes");
            return;
        }
        for (int[] obstacle : obstacles) {
            if (obstacle[0] == 0 || obstacle[2] == 0) {
                continue;
            }
            if (check(obstacle[0], obstacle[3])) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}