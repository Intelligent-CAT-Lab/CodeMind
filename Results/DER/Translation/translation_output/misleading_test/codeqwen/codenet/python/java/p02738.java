Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int m = 0; m < n * 5; m++) {
                d[i][m] = (d[i - 3][m] * k + roll(d[k], -1)[m] + roll(d[j], 1)[m]) % M;
            }
        }
        System.out.println(Arrays.stream(d[l - 1]).sum() % M);
    }

    public static long[] roll(long[] array, int shift) {
        long[] result = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(i + shift) % array.length] = array[i];
        }
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, creates a 2D array `d` with dimensions `l` by `n * 5`, and fills it according to the rules of your Python code. Finally, it prints the sum of the elements of the last row of `d` modulo `M`.

The `roll` method is a helper function that shifts the elements of an array to the left or right by a specified number of positions. It creates a new array of the same length as the input array, and then copies the elements of the input array to the corresponding positions in the new array. If the shift is positive, it shifts the elements to the right; if the shift is negative, it shifts the elements
