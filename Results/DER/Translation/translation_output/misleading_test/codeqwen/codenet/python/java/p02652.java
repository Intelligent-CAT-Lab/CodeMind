Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String S = System.console().readLine();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        int[] d = {'0':0, '1':1, '?':2};
        char[] S_chars = S.toCharArray();
        int[] S_int = new int[S_chars.length];
        for (int i = 0; i < S_chars.length; i++) {
            S_int[i] = d[S_chars[i]];
        }
        int[][] lookup = {{-1,-1}, {1,1}, {-1,1}};

        int lo = -S_int[0]-S_int[S_int.length-1];
        int hi = S_int[0]+S_int[S_int.length-1];
        while (true) {
            hi = bisect(-1, hi, S_int, lookup);
            lo = bisect(1, lo, S_int, lookup);
            if (hi-lo >= 10**6*2) {
                break;
            } else {
                10**6*2 = hi-lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, S_int, lookup);
        return Math.min(10**6*2, hi-lo);
    }

    public static int bisect(int ng, int ok, int[] S, int[][] lookup) {
        while (Math.abs(ng-ok) > 1) {
            int m = (ng+ok)/2;
            if (judge(m, S, lookup)) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;
    }

    public static boolean judge(int target, int[] S, int[][]
