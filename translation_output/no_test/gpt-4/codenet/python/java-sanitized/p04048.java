import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p04048 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().trim().split("\\s+");
        int N = Integer.parseInt(firstLine[0]);
        int X = Integer.parseInt(firstLine[1]);

        System.out.println((N - gcd(N, X)) * 3);
    }

    private static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }

    // Helpers for multi-dimensional array creation with default values
    private static int[][] list2d(int a, int b, int c) {
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = c;
            }
        }
        return array;
    }

    private static int[][][] list3d(int a, int b, int c, int d) {
        int[][][] array = new int[a][b][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    array[i][j][k] = d;
                }
            }
        }
        return array;
    }

    private static int[][][][] list4d(int a, int b, int c, int d, int e) {
        int[][][][] array = new int[a][b][c][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < d; l++) {
                        array[i][j][k][l] = e;
                    }
                }
            }
        }
        return array;
    }

    // Helper to ceil divide two integers
    private static int ceil(int x, int y) {
        return (int) Math.ceil((double) x / y);
    }
    
    // Helper functions to print Yes/No in different cases
    private static void Yes() {
        System.out.println("Yes");
    }

    private static void No() {
        System.out.println("No");
    }

    private static void YES() {
        System.out.println("YES");
    }

    private static void NO() {
        System.out.println("NO");
    }
}