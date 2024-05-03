Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int[][] obstacles = new int[N][4];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                obstacles[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        double g = 9.8;
        double eps = 1e-10;

        if (check(X, Y, V, g, eps, obstacles)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(int X, int Y, int V, double g, double eps, int[][] obstacles) {
        if (X == 0) {
            return false;
        }
        double a = g * g / 4;
        double b = V * V - g * X;
        double c = X * X + V * V;
        double D = b * b - 4 * a * c;
        if (D < -eps) {
            return false;
        }
        if (-eps <= D && D < 0) {
            D = 0;
        }
        for (int d = -1; d <= 1; d++) {
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = X / t;
            double vy = V / t + g * t / 2;
            if (calc(vy, X / vx) < Y - eps)
