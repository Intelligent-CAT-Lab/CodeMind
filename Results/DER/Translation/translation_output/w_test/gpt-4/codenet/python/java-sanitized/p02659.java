import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class p02659 {

    // Adjust the recursion limit
    // Note: In java, you cannot modify the recursion limit as in Python.
    // This is usually not required unless you are expecting very deep recursion.

    // MOD constant
    private static final int MOD = (int) 1e9 + 7;

    // A method for simplifying space-separated input reading
    private static String[] splitInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine().trim().split("\\s+");
    }

    // A method to make a grid with the given number, height and width
    private static int[][] makeGrid(int h, int w, int num) {
        int[][] grid = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                grid[i][j] = num;
            }
        }
        return grid;
    }

    // A method to create an adjacency list for an undirected graph
    private static List<List<Integer>> makeAdjlistUnd(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            res.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            res.get(edge[0]).add(edge[1]);
            res.get(edge[1]).add(edge[0]);
        }
        return res;
    }

    // A method to create an adjacency list for a directed graph
    private static List<List<Integer>> makeAdjlistDir(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            res.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            res.get(edge[0]).add(edge[1]);
        }
        return res;
    }

    // A method to calculate combination nCr
    private static BigInteger cmb(int n, int r) {
        BigInteger nf = factorial(n);
        BigInteger rf = factorial(r);
        BigInteger nrf = factorial(n - r);
        return nf.divide(rf.multiply(nrf));
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        // Read input using the helper method
        String[] inputs = splitInput();
        // Parse the two input values
        BigDecimal A = new BigDecimal(inputs[0]);
        BigDecimal B = new BigDecimal(inputs[1]);
        // Multiply, round down and print the result
        System.out.println(A.multiply(B).setScale(0, RoundingMode.DOWN).intValue());
    }
}