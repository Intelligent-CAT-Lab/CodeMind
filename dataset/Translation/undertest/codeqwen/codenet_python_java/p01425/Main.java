import java.util.Scanner;

public class p01425 {
    static double g = 9.8;
    static double eps = 1e-10;

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

        if (check(X, Y, obstacles)) {
            System.out.println("Yes");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (obstacles[i][0] == 0 || obstacles[i][2] == 0) {
                continue;
            }
            if (check(obstacles[i][0], obstacles[i][3], obstacles) || check(obstacles[i][2], obstacles[i][3], obstacles)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    static double calc(double vy, double t) {
        return vy * t - g / 2 * t * t;
    }

    static int cmp(int lb, int ub, double x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    static boolean check(int qx, int qy, int[][] obstacles) {
        if (qx == 0) {
            return false;
        }
        double a = g * g / 4;
        double