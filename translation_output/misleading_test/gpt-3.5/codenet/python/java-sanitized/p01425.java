import java.util.Scanner;

public class p01425 {
    static double g = 9.8;
    static double eps = 1e-10;
    static int N, V, X, Y;
    static int[][] obstacles;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        V = scanner.nextInt();
        X = scanner.nextInt();
        Y = scanner.nextInt();
        obstacles = new int[N][4];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                obstacles[i][j] = scanner.nextInt();
            }
        }

        if (check(X, Y)) {
            System.out.println("Yes");
            System.exit(0);
        }

        for (int i = 0; i < N; i++) {
            int[] obstacle = obstacles[i];
            int L = obstacle[0];
            int T = obstacle[3];

            if (L != 0) {
                if (check(L, T)) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }

            int R = obstacle[2];

            if (R != 0) {
                if (check(R, T)) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }

        System.out.println("No");
    }

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

    static boolean check(int qx, int qy) {
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
        for (int d : new int[]{-1, 1}) {
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = qx / t;
            double vy = qy / t + g * t / 2;
            if (calc(vy, X / vx) < Y - eps) {
                continue;
            }
            for (int[] obstacle : obstacles) {
                int l = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[0] / vx));
                int r = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[2] / vx));
                int xh = cmp(obstacle[0], obstacle[2], vx * (vy / g));
                int yh = cmp(obstacle[1], obstacle[3], calc(vy, vy / g));
                if (l * r <= 0 || (xh == 0 && yh * l <= 0)) {
                    break;
                }
            }
            return true;
        }
        return false;
    }
}