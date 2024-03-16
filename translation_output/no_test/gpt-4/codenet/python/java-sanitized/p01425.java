public class p01425 {
    private static final double g = 9.8;
    private static final double eps = 1e-10;
    static int N;
    static double V, X, Y;
    static double[][] obstacles;

    public static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }

    public static int cmp(double lb, double ub, double x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    public static int check(double qx, double qy) {
        if (qx == 0) {
            return 0;
        }
        double a = g * g / 4;
        double b = qy * g - V * V;
        double c = qx * qx + qy * qy;
        double D = b * b - 4 * a * c;
        if (D < -eps) {
            return 0;
        }
        if (D >= -eps && D < 0) {
            D = 0;
        }
        for (int d : new int[]{-1, 1}) {
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = qx / t;
            double vy = qy / t + g * t / 2;
            if (calc(vy, X / vx) < Y - eps) {
                return 0;
            }
            for (double[] obstacle : obstacles) {
                double L = obstacle[0];
                double B = obstacle[1];
                double R = obstacle[2];
                double T = obstacle[3];
                int l = cmp(B, T, calc(vy, L / vx));
                int r = cmp(B, T, calc(vy, R / vx));
                int xh = cmp(L, R, vx * (vy / g));
                int yh = cmp(B, T, calc(vy, vy / g));
                if (l * r <= 0 || xh == 0 && yh * l <= 0) {
                    break;
                }
            }
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        V = scanner.nextDouble();
        X = scanner.nextDouble();
        Y = scanner.nextDouble();
        obstacles = new double[N][4];
        
        for (int i = 0; i < N; i++) {
            double L = scanner.nextDouble();
            double B = scanner.nextDouble();
            double R = scanner.nextDouble();
            double T = scanner.nextDouble();
            if (L < X) {
                obstacles[i] = new double[]{L, B, Math.min(R, X), T};
            }
        }

        if (check(X, Y) == 1) {
            System.out.println("Yes");
            System.exit(0);
        }

        for (double[] obstacle : obstacles) {
            double L = obstacle[0];
            double B = obstacle[1];
            double R = obstacle[2];
            double T = obstacle[3];
            if (L == 0 || R == 0) {
                continue;
            }
            if (check(L, T) == 1 || check(R, T) == 1) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
        scanner.close();
    }
}