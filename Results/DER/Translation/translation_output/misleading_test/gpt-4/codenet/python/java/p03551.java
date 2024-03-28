Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int time = 1900 * M + (N - M) * 100;
        int result = time * (1 << M); // 2^M can be calculated using a bit shift to the left (<<)

        System.out.println(result);
        scanner.close();
    }
}
```

To run the test case with input "1 1", you would use the program like this (input is provided via the standard input stream):

```plaintext
Input:
1 1

Output:
3900
```

Please note that in the Java version, we use `1 << M` to perform the power of two calculations since `2^M` is equivalent to `1 << M` in bitwise operations. This is a more efficient way to calculate the power of two in Java, as it only involves bit manipulation, avoiding the use of a potentially slower `Math.pow()` function.
