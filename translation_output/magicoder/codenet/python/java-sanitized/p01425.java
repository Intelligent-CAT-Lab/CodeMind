import java.util.*;

public class p01425 {
    static double g = 9.8;
    static double eps = 1e-10;
    static int N, V, X, Y;
    static List<int[]> obstacles = new ArrayList<>();

    static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }

    static int cmp(double lb, double ub, double x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    static int check(double qx, double qy) {
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
                return 0;
            }
            for (int[] obstacle : obstacles) {
                int L = obstacle[0], B = obstacle[1], R = obstacle[2], T = obstacle[3];
                int l = cmp(B, T, calc(vy, L / vx));
                int r = cmp(B, T, calc(vy, R / vx));
                int xh = cmp(L, R, vx * (vy / g));
                int yh = cmp(B, T, calc(vy, vy / g));
                if (l * r <= 0 || !(xh == 0 && yh * l <= 0)) {
                    break;
                }
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        V = scanner.nextInt();
        X = scanner.nextInt();
        Y = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt();
            int B = scanner.nextInt();
            int R = scanner.nextInt();
            int T = scanner.nextInt();
            if (L < X) {
                obstacles.add(new int[]{L, B, Math.min(R, X), T});
            }
        }
        if (check(X, Y) == 1) {
            System.out.println("Yes");
            return;
        }
        for (int[] obstacle : obstacles) {
            if (obstacle[0] == 0 || obstacle[2] == 0) {
                continue;
            }
            if (check(obstacle[0], obstacle[3]) == 1 || check(obstacle[2], obstacle[3]) == 1) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}