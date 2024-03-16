```java
import java.util.*;

public class Main {
    static double g = 9.8;
    static double eps = 1e-10;
    static List<int[]> obstacles = new ArrayList<>();

    public static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }

    public static int cmp(double lb, double ub, double x) {
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
        if (-eps <= D && D < 0) {
            D = 0;
        }
        for (int d : new int[]{-1, 1}) {
            double tt = (-b + d * Math.pow(D, 0.5)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.pow(tt, 0.5);
            double vx = qx / t;
            double vy = qy / t + g * t / 2;
            if (calc(vy, X / vx) < Y - eps) {
                return 0;
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
                if (l * r <= 0 || (xh == 0 && yh * l <= 0)) {
                    break;
                }
            }
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

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
            int L = obstacle[0];
            int T = obstacle[3];
            if (L != 0 && T != 0 && (check(L, T) == 1 || check(obstacle[2], T) == 1)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
```
Make sure to replace the `import java.util.*;` with the specific imports required for your program.
