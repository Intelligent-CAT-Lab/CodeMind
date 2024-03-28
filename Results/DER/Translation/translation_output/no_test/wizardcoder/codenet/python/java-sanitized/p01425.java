import java.util.*;

public class p01425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        double g = 9.8;
        double eps = 1e-10;
        List<double[]> obstacles = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            int B = sc.nextInt();
            int R = sc.nextInt();
            int T = sc.nextInt();
            if (L < X) {
                obstacles.add(new double[]{L, B, Math.min(R, X), T});
            }
        }

        double qx = X;
        double qy = Y;
        if (check(qx, qy)) {
            System.out.println("Yes");
            return;
        }
        for (double[] obstacle : obstacles) {
            double L = obstacle[0];
            double B = obstacle[1];
            double R = obstacle[2];
            double T = obstacle[3];
            if (L == 0 || R == 0) {
                continue;
            }
            if (check(L, T) || check(R, T)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    public static boolean check(double qx, double qy) {
        if (qx == 0) {
            return false;
        }
        double a = g * g / 4;
        double b = qy * g - V * V;
        double c = qx * qx + qy * qy;
        double D = b * b - 4 * a * c;
        if (D < -eps) {
            return false;
        }
        if (-eps <= D && D < 0) {
            D = 0;
        }
        for (double d : new double[]{-1, 1}) {
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = qx / t;
            double vy = qy / t + g * t / 2;
            if (calc(vy, X / vx) < Y - eps) {
                return false;
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
                if (l * r <= 0 ||!xh && yh * l <= 0) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int cmp(double a, double b, double c) {
        if (Math.abs(c - a) < eps) {
            return -1;
        }
        if (Math.abs(c - b) < eps) {
            return 1;
        }
        return 0;
    }

    public static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }
}