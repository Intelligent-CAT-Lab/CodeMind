Below is the translated version of the given Python code into Java.

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        // Calculating the distances
        int b = Math.abs(A[0] - A[1]) + Math.abs(A[0] - A[2]);
        int c = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        int d = Math.abs(A[0] - A[2]) + Math.abs(A[1] - A[2]);

        // Printing the minimum distance
        System.out.println(Math.min(b, Math.min(c, d)));
    }
}
```

To use the code, you would run the `Solution` class, and it expects you to enter three integers separated by spaces, simulating the `input()` from the original Python script. Once the numbers are entered, it will calculate and print the expected output as the Python script does.
