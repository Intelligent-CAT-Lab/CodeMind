```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (B >= C && C >= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        } else {
            return gcd(m, n % m);
        }
    }

    public static int gcdList(int[] L) {
        int v = L[0];
        for (int i = 1; i < L.length; i++) {
            v = gcd(v, L[i]);
        }
        return v;
    }

    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static int lcmList(int[] L) {
        int v = L[0];
        for (int i = 1; i < L.length; i++) {
            v = lcm(v, L[i]);
        }
        return v;
    }

    public static int[] wfsD(int[][] D, int N, int K) {
        int[] dfk = new int[N + 1];
        Arrays.fill(dfk, -1);
        dfk[K] = 0;

        List<int[]> cps = new ArrayList<>();
        boolean[] r = new boolean[N + 1];
        r[K] = true;

        cps.add(new int[]{K, 0});

        while (!cps.isEmpty()) {
            List<int[]> n_cps = new ArrayList<>();
            for (int[] cp : cps) {
                int cpVal = cp[0];
                int cd = cp[1];
                for (int i = 0; i < D[cpVal].length; i++) {
                    if (D[cpVal][i] != -1 && !r[i]) {
                        dfk[i] = cd + D[cpVal][i];
                        n_cps.add(new int[]{i, cd + D[cpVal][i]});
                        r[i] = true;
                    }
                }
            }
            cps = new ArrayList<>(n_cps);
        }

        return dfk;
    }

    public static void dfsD(int v, int pre, int dist, int[][] D, int[] dfsD) {
        dfsD[v] = dist;
        for (int[] next : D[v]) {
            int nextV = next[0];
            int d = next[1];
            if (nextV != pre) {
                dfsD(nextV, v, dist + d, D, dfsD);
            }
        }
    }

    public static long sigma(long N) {
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i;
        }
        return ans;
    }

    public static long comb(int n, int r) {
        if (n - r < r) {
            r = n - r;
        }
        if (r == 0) {
            return 1;
        }
        if (r == 1) {
            return n;
        }

        long[] numerator = new long[r];
        long[] denominator = new long[r];
        for (int k = 0; k < r; k++) {
            numerator[k] = n - r + k + 1;
            denominator[k] = k + 1;
        }

        for (int p = 2; p <= r; p++) {
            long pivot = denominator[p - 1];
            if (pivot > 1) {
                int offset = (n - r) % p;
                for (int k = p - 1; k < r; k += p) {
                    numerator[k - offset] /= pivot;
                    denominator[k] /= pivot;
                }
            }
        }

        long result = 1;
        for (int k = 0; k < r; k++) {
            if (numerator[k] > 1) {
                result *= numerator[k];
            }
        }

        return result;
    }

    public static boolean bisearch(int[] L, int target) {
        int low = 0;
        int high = L.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = L[mid];
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

}
```
