import java.util.*;

public class p01869 {
    private static final ArrayList<Long> a = new ArrayList<>();
    private static final int LIMIT = 1 << 20; // Equivalent to -1 << 20 for negative number in Python.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        if ((n & 1) != 0) {
            System.out.println(-1);
            System.exit(0);
        }

        generateBinNums(0, n);
        Collections.sort(a);

        int result = findMaxMultiplicity(n, 0);
        System.out.println(result < 0 ? -1 : result);
    }

    private static void generateBinNums(long bin, long n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        generateBinNums(bin * 10 + 2, n);
        generateBinNums(bin * 10 + 8, n);
    }

    private static int findMaxMultiplicity(long n, int p) {
        int maxMult = LIMIT;
        int x = Collections.binarySearch(a, n);
        
        if (x >= 0 && a.get(x) == n) maxMult = 1;
        if (p >= a.size() || Math.pow(a.get(p), 2) > n) return maxMult;
        if (n % a.get(p) == 0) maxMult = Math.max(maxMult, findMaxMultiplicity(n / a.get(p), p) + 1);
        
        return Math.max(maxMult, findMaxMultiplicity(n, p + 1));
    }
}