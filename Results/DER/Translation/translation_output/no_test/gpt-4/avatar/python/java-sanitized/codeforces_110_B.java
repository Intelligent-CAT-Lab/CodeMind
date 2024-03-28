import java.util.Scanner;

public class codeforces_110_B {

    // Since Python's heappush and heappop, deque, and defaultdict are not used in the solution function,
    // we don't need to translate those imports to Java.

    // Similarly, bisect functions and lru_cache from functools are not used, so no need for equivalent Java code.

    // Constant similar to MOD in the Python code
    private static final long MOD = (long)1e9 + 7;

    // Scanner for reading input, similar to Python's input() function.
    private static final Scanner scanner = new Scanner(System.in);

    private static void solution() {
        int n = scanner.nextInt();
        System.out.print("abcd".repeat(n / 4) + "abc".substring(0, n % 4));
    }

    public static void main(String[] args) {
        // Set up the thread stack size as in Python's threading.stack_size
        // Not directly possible in Java, but could be set via JVM argument -Xss<size> if truly necessary.
        // For this code, we don't need to change stack size, so I'm omitting it.

        // Increase the recursion limit equivalent is also not directly possible in Java.
        // However, Java has a higher default limit compared to Python so it might not be necessary.

        // Running the solution in a single main thread.
        // No need to create another thread explicitly as we are not dealing with stack size or recursion limits.

        int t = 1;
        for (int i = 0; i < t; i++) {
            solution();
        }
    }
}