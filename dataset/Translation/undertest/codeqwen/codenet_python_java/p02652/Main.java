import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        Map<Character, Integer> d = new HashMap<>();
        d.put('0', 0);
        d.put('1', 1);
        d.put('?', 2);
        char[] SArray = S.toCharArray();
        int[] SIntArray = new int[SArray.length];
        for (int i = 0; i < SArray.length; i++) {
            SIntArray[i] = d.get(SArray[i]);
        }
        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};

        int lo = -SIntArray[0] - SIntArray[SIntArray.length - 1];
        int hi = SIntArray[SIntArray.length - 1] - SIntArray[0];
        while (true) {
            hi = bisect(-1, hi, SIntArray, lookup);
            lo = bisect(1, lo, SIntArray, lookup);
            if (hi - lo >= 10 * 1000) {
                break;
            } else {
                hi += 1;
            }
        }
        return Math.min(hi - lo, hi - lo);
    }

    public static int bisect(int ng, int ok, int[] S, int[][] lookup) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge(m, S, lookup)) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;
    }

    public static boolean judge(int target, int[] S, int[][