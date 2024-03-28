import java.util.*;

public class p01425 {
    static double g = 9.8;
    static double eps = 1e-10;
    static int N, V, X, Y;
    static List<int[]> obstacles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        V = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            int B = sc.nextInt();
            int R = sc.nextInt();
            int T = sc.nextInt();
            if (L < X) {
                obstacles.add(new int[]{L, B, R, T});
            }
        }

        if (check(X, Y)) {
            System.out.println("Yes");
            return;
        }

        for (int[] obstacle : obstacles) {
            if (obstacle[0] == 0 || obstacle[1] == 0) {
                continue;
            }
            if (check(obstacle[0], obstacle[1])) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

    public static int calc(double vy, double t) {
        return (int) (vy * t - 0.5 * t * t);
    }

    public static int cmp(int lb, int ub, double x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    public static int check(int qx, int qy) {
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
        if (-eps <= D < 0) {
            D = 0;
        }
        for (double d = -1; d <= 1; d++) {
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = qx / t;
            double vy = qy / t + g * t / 2;
            int result = calc(vy, X / vx);
            if (result < Y - eps) {
                return 0;
            }
            for (int[] obstacle : obstacles) {
                int l = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[0] / vx));
                int r = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[2] / vx));
                int xh = cmp(obstacle[0], obstacle[2], vx * (vy / g));
                int yh = cmp(obstacle[1], obstacle[3], calc(vy, vy / g));
                if (l * r <= 0 || !xh && yh * l <= 0) {
                    break;
                }
            }
            if (l * r <= 0 || !xh && yh * l <= 0) {
                break;
            }
        }
        return 1;
    }
}