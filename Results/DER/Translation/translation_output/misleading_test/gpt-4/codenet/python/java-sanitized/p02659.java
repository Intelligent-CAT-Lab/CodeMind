import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class p02659 {

    private static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = reader.readLine().split(" ");
        BigDecimal A = new BigDecimal(parts[0]);
        BigDecimal B = new BigDecimal(parts[1]);
        System.out.println(A.multiply(B).setScale(0, BigDecimal.ROUND_HALF_UP).intValueExact());
    }

    public static List<List<Integer>> makeGrid(int h, int w, int num) {
        List<List<Integer>> grid = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            List<Integer> row = new ArrayList<>(w);
            for (int j = 0; j < w; j++) {
                row.add(num);
            }
            grid.add(row);
        }
        return grid;
    }

    public static List<List<Integer>> makeAdjListD(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        return adjList;
    }

    public static List<List<Integer>> makeAdjListNonD(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
        }
        return adjList;
    }

    // Combination nCr
    public static long cmb(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= n - i;
            result /= i + 1;
        }
        return result;
    }
}