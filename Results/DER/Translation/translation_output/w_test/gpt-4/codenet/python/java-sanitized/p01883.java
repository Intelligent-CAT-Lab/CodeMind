import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class p01883 {
    
    private static final int[] a = new int[50000];
    
    static {
        // Precompute the triangle numbers
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + i;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solve(n));
        scanner.close();
    }
    
    private static String solve(int n) {
        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            // If 'n' is not a perfect triangle number, find the insertion point
            t = -t - 1;
        }
        int total = 2 * t;
        char[] r = new char[total];
        Arrays.fill(r, 0, t, '(');
        Arrays.fill(r, t, total, ')');
        
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                // Swap
                char temp = r[ti];
                r[ti] = r[ti - ts];
                r[ti - ts] = temp;
                n -= t - ts;
            } else {
                break;
            }
        }
        
        return new String(r);
    }
}