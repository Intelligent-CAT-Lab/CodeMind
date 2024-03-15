import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class p02659 {
    static final int MOD = 1_000_000_007;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int ni() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static double[] nda() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[st.countTokens()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Double.parseDouble(st.nextToken());
        return arr;
    }

    static int[] nia() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }

    static String ns() throws IOException {
        return br.readLine().trim();
    }

    static int[][] makeGrid(int h, int w, int num) {
        int[][] grid = new int[h][w];
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                grid[i][j] = num;
        return grid;
    }

    static List<List<Integer>> makeAdjListD(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            res.add(new ArrayList<>());
        for (int[] edge : edges) {
            res.get(edge[0]).add(edge[1]);
            res.get(edge[1]).add(edge[0]);
        }
        return res;
    }

    static List<List<Integer>> makeAdjListNonD(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            res.add(new ArrayList<>());
        for (int[] edge : edges) {
            res.get(edge[0]).add(edge[1]);
        }
        return res;
    }

    static BigInteger cmb(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) throws IOException {
        String[] input = ns().split(" ");
        BigDecimal A = new BigDecimal(input[0]);
        BigDecimal B = new BigDecimal(input[1]);
        BigDecimal result = A.multiply(B).setScale(0, RoundingMode.DOWN);
        System.out.println(result.toBigIntegerExact());
    }
}