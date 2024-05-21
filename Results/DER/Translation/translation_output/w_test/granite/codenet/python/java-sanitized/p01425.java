import java.util.*;

public class p01425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] obstacles = new int[N][4];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                obstacles[i][j] = sc.nextInt();
            }
        }
        double g = 9.8;
        double eps = 1e-10;
        if (check(X, Y, obstacles, g, eps)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(int qx, int qy, int[][] obstacles, double g, double eps) {
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
        for (int d = -1; d <= 1; d += 2) {
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
            for (int[] obstacle : obstacles) {
                int L = obstacle[0];
                int B = obstacle[1];
                int R = obstacle[2];
                int T = obstacle[3];
                int l = cmp(B, T, calc(vy, L / vx));
                int r = cmp(B, T, calc(vy, R / vx));
                int xh = cmp(L, R, vx * (vy / g));
                int yh = cmp(B, T, calc(vy, vy / g));
                if (l * r <= 0 || (!xh == 0 && yh * l <= 0)) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int cmp(int lb, int ub, double x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    public static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }
}