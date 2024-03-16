import java.util.*;
import java.io.*;

public class p01425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        double g = 9.8;
        double eps = 1e-10;
        double[][] obstacles = new double[N][4];
        for (int i = 0; i < N; i++) {
            obstacles[i][0] = sc.nextDouble();
            obstacles[i][1] = sc.nextDouble();
            obstacles[i][2] = sc.nextDouble();
            obstacles[i][3] = sc.nextDouble();
        }
        double lb = 0, ub = X;
        while (ub - lb > eps) {
            double mid = (lb + ub) / 2;
            if (check(mid, Y, obstacles, g, eps)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(lb);
    }

    public static boolean check(double x, double y, double[][] obstacles, double g, double eps) {
        double qx = x, qy = y;
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
            if (vy * t - g / 2 * t * t > Y - eps) {
                continue;
            }
            for (int i = 0; i < obstacles.length; i++) {
                double L = obstacles[i][0], B = obstacles[i][1], R = obstacles[i][2], T = obstacles[i][3];
                double l = cmp(B, T, vy * t - g / 2 * t * t);
                double r = cmp(B, T, vy * t - g / 2 * t * t);
                double xh = cmp(L, R, vx * (vy / g));
                double yh = cmp(B, T, vy * (vy / g));
                if (l * r <= 0 ||!xh && yh * l <= 0) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static double cmp(double a, double b, double c) {
        if (a < b + eps) {
            return -1;
        }
        if (a > b - eps) {
            return 1;
        }
        return 0;
    }
}