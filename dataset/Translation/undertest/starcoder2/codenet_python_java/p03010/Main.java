import java.util.*;
import java.io.*;

public class p03010 {
    static int n;
    static int[][] ans;
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;
        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(vn - 1)) {
                int cur = 0;
                for (int i = 0; i < path.length - 1; i++) {
                    cur += ans[path[i]][path[i + 1]];
                }
                if (cur > mx) {
                    mx = cur;
                }
            }
            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }
        for (int[] row : ans) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] permutations(int n) {
        int[][] res = new int[factorial(n)][n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int k = 0;
        while (k >= 0) {
            res[k] = Arrays.copyOf(a, n);
            int i = k;
            while (i < n - 1 && a[i] >= a[i + 1]) {
                i++;
            }
            if (i == n - 1) {
                k--;
            } else {
                int j = n - 1;
                while (a[i] >= a[j]) {
                    j--;
                }
                swap(a, i, j);
                reverse(a, i + 1, n - 1);
                k++;
            }
        }
        return res;
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void reverse(int[] a, int i, int j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}