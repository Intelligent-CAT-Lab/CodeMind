import java.util.*;
import java.io.*;

public class p03719 {
    static final int MAX = 1000000;
    static int[] D_dfs_d;
    static List<int[]>[] D;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        System.out.println((B >= C && C >= A) ? "Yes" : "No");
    }

    // Binary converter
    static String toBin(int x) {
        return Integer.toBinaryString(x);
    }

    // Greatest common divisor
    static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }

    static int gcdList(int[] L) {
        int v = L[0];
        for (int i = 1; i < L.length; i++) {
            v = gcd(v, L[i]);
        }
        return v;
    }

    // Least common multiple
    static int lcm(int n, int m) {
        return (n / gcd(n, m)) * m;
    }

    static int lcmList(int[] L) {
        int v = L[0];
        for (int i = 1; i < L.length; i++) {
            v = lcm(v, L[i]);
        }
        return v;
    }

    // Summation of natural numbers up to N
    static int sigma(int N) {
        return N * (N + 1) / 2;
    }

    // Combination (n choose r)
    static long comb(int n, int r) {
        if (n - r < r) r = n - r;
        if (r == 0) return 1;
        if (r == 1) return n;
        
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result *= n - r + i;
            result /= i;
        }
        return result;
    }

    // Binary search
    static boolean bisearch(int[] L, int target) {
        int low = 0;
        int high = L.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int guess = L[mid];
            if (guess == target)
                return true;
            else if (guess < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
    
    // Depth First Search with Distance
    static void dfs_d(int v, int pre, int dist) {
        D_dfs_d[v] = dist;
        for (int[] next : D[v]) {
            if (next[0] != pre)
                dfs_d(next[0], v, dist + next[1]);
        }
    }

    //