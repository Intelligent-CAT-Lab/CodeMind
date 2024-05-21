import java.util.*;

public class p01425 {
    static double g = 9.8;
    static double eps = 1e-10;
    static int N, V, X, Y;
    static int[][] obstacles;

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
        for (int d = -1; d <= 1; d += 2) {
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
                int l = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[0] / vx));
                int r = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[2] / vx));
                int xh = cmp(obstacle[0], obstacle[2], vx * (vy / g));
                int yh = cmp(obstacle[1], obstacle[3], calc(vy, vy / g));
                if (l * r <= 0 ||!xh && yh * l <= 0) {
                    break;
                }
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        V = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();
        obstacles = new int[N][4];
        for (int i = 0; i < N; i++) {
            obstacles[i][0] = sc.nextInt();
            obstacles[i][1] = sc.nextInt();
            obstacles[i][2] = sc.nextInt();
            obstacles[i][3] = sc.nextInt();
            if (obstacles[i][0] < X) {
                obstacles[i][0] = Math.max(obstacles[i][0], 0);
                obstacles[i][2] = Math.min(obstacles[i][2], X);
            }
        }
        if (check(X, Y) == 1) {
            System.out.println("Yes");
        } else {
            for (int[] obstacle : obstacles) {
                if (obstacle[0]!= 0 && obstacle[2]!= 0) {
                    if (check(obstacle[0], obstacle[3]) == 1 || check(obstacle[2], obstacle[3]) == 1) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
            System.out.println("No");
        }
    }
}