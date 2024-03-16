```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Main {

    // Set max recursion limit (this concept is not directly applicable in Java)
    // In Java, you can set the max stack size via the -Xss JVM argument instead.

    // Debug output (this specific method is not standard in Java, can be implemented differently)
    public static void chkprint(Object... args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String methodName = stackTraceElements[2].getMethodName();
        for (Object arg : args) {
            System.out.println(methodName + " = " + arg);
        }
    }

    // Binary converter
    public static String to_bin(int x) {
        return Integer.toBinaryString(x);
    }

    public static List<Integer> li_input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().trim().split("\\s+");
        List<Integer> list = new ArrayList<>();
        for (String s : strings) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    public static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }

    public static int gcd_list(List<Integer> L) {
        int v = L.get(0);
        for (int i = 1; i < L.size(); i++) {
            v = gcd(v, L.get(i));
        }
        return v;
    }

    public static int lcm(int n, int m) {
        return (n / gcd(n, m)) * m;
    }

    public static int lcm_list(List<Integer> L) {
        int v = L.get(0);
        for (int i = 1; i < L.size(); i++) {
            v = lcm(v, L.get(i));
        }
        return v;
    }

    // Width First Search (+ Distance)
    public static int[] wfs_d(int[][] D, int N, int K) {
        int[] dfk = new int[N + 1];
        Arrays.fill(dfk, -1);
        dfk[K] = 0;

        Deque<int[]> cps = new ArrayDeque<>();
        cps.add(new int[]{K, 0});
        boolean[] r = new boolean[N + 1];
        r[K] = true;
        while (!cps.isEmpty()) {
            Deque<int[]> n_cps = new ArrayDeque<>();
            for (int[] cp_cd : cps) {
                int cp = cp_cd[0];
                int cd = cp_cd[1];
                for (int i = 0; i < D[cp].length; i++) {
                    int dfcp = D[cp][i];
                    if (dfcp != -1 && !r[i]) {
                        dfk[i] = cd + dfcp;
                        n_cps.add(new int[]{i, cd + dfcp});
                        r[i] = true;
                    }
                }
            }
            cps = n_cps;
        }
        return dfk;
    }

    // Depth First Search (+Distance)
    // Keeping this method stubbed because it's not fully portable without additional context
    public static void dfs_d(int v, int pre, int dist) {
        // Implementation here would require context about the graph and list of distances
    }

    public static int sigma(int N) {
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i;
        }
        return ans;
    }

    public static int comb(int n, int r) {
        if (n - r < r) r = n - r;
        if (r == 0) return 1;
        if (r == 1) return n;

        int[] numerator = new int[r];
        for (int k = 0; k < r; k++) {
            numerator[k] = n - r + k + 1;
        }
        int[] denominator = new int[r];
        for (int k = 0; k < r; k++) {
            denominator[k] = k + 1;
        }

        for (int p = 2; p <= r; p++) {
            int pivot = denominator[p - 1];
            if (pivot > 1) {
                int offset = (n - r) % p;
                for (int k = p - 1; k < r; k += p) {
                    numerator[k - offset] /= pivot;
                    denominator[k] /= pivot;
                }
            }
        }

        int result = 1;
        for (int k = 0; k < r; k++) {
            if (numerator[k] > 1) {
                result *= numerator[k];
            }
        }

        return result;
    }

    public static boolean bisearch(List<Integer> L, int target) {
        int low = 0;
        int high = L.size() - 1;
        int guess = -1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            guess = L.get(mid);
            if (guess == target) {
                return true;
            } else if (guess < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    // --------------------------------------------

    // dp placeholder

    public static void main(String[] args) throws IOException {
        List<Integer> input = li_input();
        int A = input.get(0);
        int B = input.get(1);
        int C = input.get(2);
        System.out.println((B >= C && C >= A) ? "Yes" : "No");
    }
}
```
Please note that in the Java version, I've taken the liberty to adjust certain parts of the code where direct analogues do not exist in Java, such as setting a recursion limit or the debugging printing function. Java exception handling is also used for I/O operations. The DFS method is left as a stub because the Python version refers to global variables that are missing context; you would need to adapt this portion of the code based on the actual use case.
