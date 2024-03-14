import java.util.*;

public class p03719 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(B >= C && C >= A ? "Yes" : "No");
    }

    // Binary converter
    public static String toBinary(int x) {
        return Integer.toBinaryString(x);
    }

    // Greatest Common Divisor
    public static int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        } else {
            return gcd(m, n % m);
        }
    }

    // Least Common Multiple
    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    // Binary Search
    public static boolean binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
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

    // Sum of numbers from 1 to N
    public static int sigma(int N) {
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i;
        }
        return ans;
    }

    // Combination
    public static int comb(int n, int r) {
        if (n - r < r) r = n - r;
        if (r == 0) return 1;
        if (r == 1