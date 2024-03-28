import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int m = 998244353;
        int[][] d = new int[C + 1][D + 1]; // Java initializes int arrays to zeroes by default

        d[A][B] = 1;

        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                if (!(i == A && j == B)) { // Skip the first cell since it's already set to 1
                    long value = (
                        ((long)d[i][j - 1] * i) + 
                        ((long)d[i - 1][j] * j) - 
                        ((long)d[i - 1][j - 1] * (i - 1) * (j - 1))
                    ) % m;
                    // Cast the result to int to assign to the array cell
                    d[i][j] = (int) (value < 0 ? value + m : value); // Handle negative values
                }
            }
        }

        // Output the result
        System.out.println(d[C][D]);
        
        scanner.close();
    }
}