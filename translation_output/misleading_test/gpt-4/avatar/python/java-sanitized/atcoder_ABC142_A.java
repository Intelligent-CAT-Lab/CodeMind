public class atcoder_ABC142_A {
    public static void main(String[] args) {
        // Test input
        int N = 64;

        // Check if N is even and print the result
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((double) (N + 1) / N / 2);
        }
    }
}