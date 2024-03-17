import java.util.*;

public class p03234 {
    private static final int cut = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
        int k = scanner.nextInt();
        int n = 2 * nn;
        List<int[]> abli = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        List<Integer> flattenabli = new ArrayList<>();
        for (int[] a : abli) {
            flattenabli.add(a[0]);
            flattenabli.add(a[1]);
        }

        int[] unused = new int[n + 1];
        Arrays.fill(unused, 1);
        for (int a : flattenabli) {
            unused[a]--;
        }
        int[] unusedacum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            unusedacum[i] = unused[i + 1] - unused[i];
        }

        int modInverse(int a, int b) {
            int r0 = a, r1 = b, s0 = 1, s1 = 0;
            while (r1 != 0) {
                int q = r0 / r1;
                int rtmp = r1;
                r1 = r0 % r1;
                r0 = rtmp;
                int stmp = s0 - q * s1;
                s0 = s1;
                s1 = stmp;
            }
            return s0 % cut;
        }

        @SuppressWarnings("unused")
        private static int doubleFactorial(int x) {
            return (int) Math.pow(2, x) * (x == 0 ? 1 : (x & 1) == 0 ? (x >> 1) * doubleFactorial(x >> 1) : doubleFactorial(x >> 1) + doubleFactorial(x >> 2));
        }

        @SuppressWarnings("unused")
        private static boolean isSandwiched(int i, int j) {
            for (int[] a : abli) {
                if (a[0] < i && i <= a[1] && a[1] <= j) {
                    return true;
                }
                if (a[0] <= i && i < a[1] && a[1] <= j) {
                    return true;
                }
            }
            return false;
        }

        List<List<Integer>> nonSandwichedNums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> nums = new ArrayList<>();
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nums.add(j);
                }
            }
            nonSandwichedNums.add(nums);
        }

        int numberUnderterminedBetween(int i, int j) {
            return unusedacum[j] - unusedacum[i - 1];
        }

        int[][] g = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    g[i][j] = modInverse(numberUnderterminedBetween(i, j), cut);
                }
            }
        }

        int ans = 0;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for