import java.util.Arrays;
import java.util.Scanner;

public class p02653 {
    static final int MOD = 1000000007;
    
    public static int[] makeDivisors(int n) {
        int sqrtN = (int)Math.sqrt(n);
        int[] tempDivisors = new int[sqrtN*2];
        int divisorCount = 0;
        
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                tempDivisors[divisorCount++] = i;
                if (i != n / i) {
                    tempDivisors[divisorCount++] = n / i;
                }
            }
        }

        int[] divisors = new int[divisorCount];
        System.arraycopy(tempDivisors, 0, divisors, 0, divisorCount);        
        return divisors;
    }

    public static int[] valueToBits(int x, int digit) {
        int[] res = new int[digit];
        int now = x;
        for (int i = 0; i < digit; i++) {
            res[i] = now % 2;
            now = now >>> 1; // Use unsigned right shift for non-negative numbers
        }
        return res;
    }

    public static int bitsToValue(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] << i; // Equivalent of 2^i is left shift
        }
        return ans;
    }

    public static int[] valueToArray10(int x, int digit) {
        int[] ans = new int[digit];
        int now = x;
        for (int i = 0; i < digit; i++) {
            ans[digit - i - 1] = now % 10;
            now = now / 10;
        }
        return ans;
    }
    
    public static int[][] zeros(int a, int b) {
        if(b <= -1) {
            return new int[a][1]; // Creates a 2D array with 1 column
        } else {
            return new int[a][b];
        }
    }

    public static int[] addV2(int[] v, int[] w) {
        return new int[]{v[0] + w[0], v[1] + w[1]};
    }

    public static int clamp(int x, int y, int z) {
        return Math.max(y, Math.min(z, x));
    }

    // Define other classes and methods needed for the complete translation

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aa, bb;
        n = sc.nextInt();
        aa = sc.nextInt();
        bb = sc.nextInt();

        // Add the remaining code that uses the methods and classes defined above
        // to complete the Java equivalent of the Python code provided
    }
}

// Define the `Bit`, `Zaatsu`, `UnionFind` classes and other helper methods
// here to complete the translation.