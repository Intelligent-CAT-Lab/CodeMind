Below is the translated Java code, following Java conventions and syntax:

```java
public class PhysicsSimulation {
    private static final double g = 9.8;
    private static final double eps = 1e-10;
    static int N;
    static double V, X, Y;
    static double[][] obstacles;

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

    public static int check(double qx, double qy) {
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
        if (D >= -eps && D < 0) {
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
                return 0;
            }
            for (double[] obstacle : obstacles) {
                double L = obstacle[0];
                double B = obstacle[1];
                double R = obstacle[2];
                double T = obstacle[3];
                int l = cmp(B, T, calc(vy, L / vx));
                int r = cmp(B, T, calc(vy, R / vx));
                int xh = cmp(L, R, vx * (vy / g));
                int yh = cmp(B, T, calc(vy, vy / g));
                if (l * r <= 0 || xh == 0 && yh * l <= 0) {
                    break;
                }
            }
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        V = scanner.nextDouble();
        X = scanner.nextDouble();
        Y = scanner.nextDouble();
        obstacles = new double[N][4];
        
        for (int i = 0; i < N; i++) {
            double L = scanner.nextDouble();
            double B = scanner.nextDouble();
            double R = scanner.nextDouble();
            double T = scanner.nextDouble();
            if (L < X) {
                obstacles[i] = new double[]{L, B, Math.min(R, X), T};
            }
        }

        if (check(X, Y) == 1) {
            System.out.println("Yes");
            System.exit(0);
        }

        for (double[] obstacle : obstacles) {
            double L = obstacle[0];
            double B = obstacle[1];
            double R = obstacle[2];
            double T = obstacle[3];
            if (L == 0 || R == 0) {
                continue;
            }
            if (check(L, T) == 1 || check(R, T) == 1) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
        scanner.close();
    }
}
```

Note the following changes from Python to Java:

1. Python does not require declaration of variable types, while Java does.
2. Java requires defining the scope of variables (e.g., static, private).
3. Java uses Math.sqrt() for square root, unlike Python’s exponentiation operator `** 0.5`.
4. Java for-each loops look different than Python’s; they use the colon `:` rather than the `in` keyword.
5. Java main method defines the starting point of the program.
6. Java uses a Scanner object for input, unlike Python’s `input()` function.
7. System.exit(0) terminates a Java program.
8. Array declaration is slightly different in Java, specifying the type and using `new`.
9. Java doesn't support tuples directly, so I use a 2D array to store obstacle data.

Make sure to compile and test the code, as translations between languages can introduce subtle bugs.
