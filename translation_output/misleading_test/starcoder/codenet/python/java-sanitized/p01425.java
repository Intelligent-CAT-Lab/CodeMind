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
        double vy = y - g / 2 * x * x;
        for (double[] obstacle : obstacles) {
            double L = obstacle[0], B = obstacle[1], R = obstacle[2], T = obstacle[3];
            if (L >= x) {
                continue;
            }
            if (R <= x) {
                continue;
            }
            double vx = x / (y - B) * (vy + g * x / 2);
            if (vy * (x / vx) < y - eps) {
                return false;
            }
            for (double[] obstacle2 : obstacles) {
                double L2 = obstacle2[0], B2 = obstacle2[1], R2 = obstacle2[2], T2 = obstacle2[3];
                if (L2 >= vx) {
                    continue;
                }
                if (R2 <= vx) {
                    continue;
                }
                double vy2 = vy + g * vx / 2;
                if (B2 <= vy2 && vy2 <= T2) {
                    return false;
                }
            }
        }
        return true;
    }
}