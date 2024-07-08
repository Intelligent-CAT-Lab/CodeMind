import java.util.Scanner;

public class Main {
    static final int MODULUS = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solve(n, k));

        sc.close();
    }

    static int solve(int n, int k) {
        int[][][] wayNums = new int[n + 1][n + 1][k + 1];
        wayNums[0][0][0] = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= n; ++j) {
                for (int p = 0; p <= k; ++p) {
                    wayNums[i][j][p] = addMod(
                            addMod(multiplyMod(2 * j + 1, getWayNum(wayNums, i - 1, j, p - 2 * j)),
                                    multiplyMod((j + 1) * (j + 1), getWayNum(wayNums, i - 1, j + 1, p - 2 * j))),
                            getWayNum(wayNums, i - 1, j - 1, p - 2 * j));
                }
            }
        }

        return wayNums[n][0][k];
    }

    static int getWayNum(int[][][] wayNums, int seenNum, int unpairNum, int oddness) {
        int n = wayNums.length - 1;

        return (unpairNum == -1 || unpairNum == n + 1 || oddness < 0) ? 0 : wayNums[seenNum][unpairNum][oddness];
    }

    static int addMod(int x, int y) {
        return (x + y) % MODULUS;
    }

    static int multiplyMod(int x, int y) {
        return (int) ((long) x * y % MODULUS);
    }
}