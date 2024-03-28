Here's the Python code translated to Java. I've added a main method and input handling to match the test case input processing described in the Python script:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrajectoryCalculation {

    private static final double g = 9.8;
    private static final double eps = 1e-10;
    private static int N;
    private static double V, X, Y;
    private static List<Obstacle> obstacles = new ArrayList<>();

    private static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }

    private static int cmp(double lb, double ub, double x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    private static int check(double qx, double qy) {
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
            for (Obstacle obstacle : obstacles) {
                double l = cmp(obstacle.B, obstacle.T, calc(vy, obstacle.L / vx));
                double r = cmp(obstacle.B, obstacle.T, calc(vy, obstacle.R / vx));
                int xh = cmp(obstacle.L, obstacle.R, vx * (vy / g));
                int yh = cmp(obstacle.B, obstacle.T, calc(vy, vy / g));
                if (l * r <= 0 || (xh == 0 && yh * l <= 0)) {
                    continue;
                }
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        V = scanner.nextDouble();
        X = scanner.nextDouble();
        Y = scanner.nextDouble();

        for (int i = 0; i < N; i++) {
            double L = scanner.nextDouble();
            double B = scanner.nextDouble();
            double R = scanner.nextDouble();
            double T = scanner.nextDouble();
            if (L < X) {
                obstacles.add(new Obstacle(L, B, Math.min(R, X), T));
            }
        }

        if (check(X, Y) == 1) {
            System.out.println("Yes");
            return;
        }
        for (Obstacle obstacle : obstacles) {
            if (obstacle.L == 0 || obstacle.R == 0) {
                continue;
            }
            if (check(obstacle.L, obstacle.T) == 1 || check(obstacle.R, obstacle.T) == 1) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    static class Obstacle {
        double L, B, R, T;

        Obstacle(double L, double B, double R, double T) {
            this.L = L;
            this.B = B;
            this.R = R;
            this.T = T;
        }
    }
}
```

To use the code above, compile and run the `TrajectoryCalculation` class using the Java environment. Input according to the test input described, with N, V, X, and Y values followed by each obstacle's L, B, R, and T values in subsequent lines. The program will output "Yes" or "No" based on the calculation results.
