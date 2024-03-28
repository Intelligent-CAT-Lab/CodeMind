import java.util.Scanner;

public class p01425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] obstacles = new int[N][4];
        for (int i = 0; i < N; i++) {
            obstacles[i][0] = sc.nextInt();
            obstacles[i][1] = sc.nextInt();
            obstacles[i][2] = sc.nextInt();
            obstacles[i][3] = sc.nextInt();
        }
        if (check(X, Y)) {
            System.out.println("Yes");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (obstacles[i][0] < X && obstacles[i][2] > X) {
                if (check(obstacles[i][0], obstacles[i][3]) || check(obstacles[i][2], obstacles[i][3])) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    public static boolean check(int qx, int qy) {
        if (qx == 0) {
            return false;
        }
        double a = 9.8 * 9.8 / 4;
        double b = qy * 9.8 - V * V;
        double c = qx * qx + qy * qy;
        double D = b * b - 4 * a * c;
        if (D < -1e-10) {
            return false;
        }
        if (-1e-10 <= D && D < 0) {
            D = 0;
        }
        for (int d = -1; d <= 1; d++) {
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = qx / t;
            double vy = qy / t + 9.8 * t / 2;
            if (calc(vy, X / vx) < Y - 1e-10) {
                return false;
            }
            for (int i = 0; i < N; i++) {
                int l = cmp(obstacles[i][1], obstacles[i][3], calc(vy, obstacles[i][0] / vx));
                int r = cmp(obstacles[i][1], obstacles[i][3], calc(vy, obstacles[i][2] / vx));
                int xh = cmp(obstacles[i][0], obstacles[i][2], vx * (vy / 9.8));
                int yh = cmp(obstacles[i][1], obstacles[i][3], calc(vy, vy / 9.8));
                if (l * r <= 0 || !xh && yh * l <= 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public static int cmp(int lb, int ub, double x) {
        if (x < lb + 1e-10) {
            return -1;
        }
        if (x > ub - 1e-10) {
            return 1;
        }
        return 0;
    }

    public static double calc(double vy, double t) {
        return vy * t - 9.8 / 2 * t * t;
    }
}