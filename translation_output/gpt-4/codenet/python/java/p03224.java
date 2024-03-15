Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for taking input from the user
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        boolean canBeAns = false;
        int k = 0;

        for (k = 1; k < 100000; ++k) {
            if (2 * N == (long) k * (k - 1)) {
                canBeAns = true;
                break;
            } else if (2 * N < (long) k * (k - 1)) {
                break;
            }
        }

        if (!canBeAns) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(k);
            int[][] sGrid = new int[k][k - 1];
            for (int i = 1; i <= k; ++i) {
                for (int j = 0; j < k - i; ++j) {
                    sGrid[i - 1][i - 1 + j] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                    sGrid[i + j][i - 1] = (i - 1) * k - i * (i - 1) / 2 + 1 + j;
                }
            }

            // Print the sGrid
            for (int[] row : sGrid) {
                System.out.print(k - 1 + " ");
                for (int i = 0; i < k - 1; ++i) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(row[i]);
                }
                System.out.println();
            }
        }
    }
}
```
Please note the differences between Python and Java:
1. Java is strongly typed, so variable types must be declared.
2. Input is handled using a `Scanner` object.
3. The `for` loop is slightly different in Java.
4. Arrays and printing arrays require explicit loops in Java.
5. Java uses `System.out.println` for printing.
6. The type `int[][]` is used for a two-dimensional array and must be properly indexed when assigning and accessing values.
7. Java does not support default values for array initialization, so the two-dimensional array `sGrid` is filled explicitly with the desired values.
