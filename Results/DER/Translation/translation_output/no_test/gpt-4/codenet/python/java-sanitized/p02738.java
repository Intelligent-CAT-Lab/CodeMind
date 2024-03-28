import java.io.*;
import java.util.*;

public class p02738 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;

        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            // Equivalent of d[i-3]*k operation
            for (int m = 0; m < d[j].length; m++) {
                d[i][m] = (d[i][m] + d[i - 3][m] * k) % M;
            }
            // Equivalent of roll(d[k], -1) operation
            long[] rolledLeft = roll(d[k], -1);
            // Equivalent of roll(d[j], 1) operation
            long[] rolledRight = roll(d[j], 1);
            // Addition, multiplication, and modulo operations
            for (int m = 0; m < d[j].length; m++) {
                d[i][m] = (d[i][m] + rolledLeft[m] * j + rolledRight[m]) % M;
            }
        }

        // Sum of elements in the last row up to l (exclusive)
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum = (sum + d[l - 1][i]) % M;
        }
        System.out.println(sum);
    }

    // Method to perform the roll operation on an array
    private static long[] roll(long[] array, int shift) {
        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            int newIndex = (i + shift) % length;
            if (newIndex < 0) {
                newIndex += length;
            }
            result[newIndex] = array[i];
        }
        return result;
    }
}