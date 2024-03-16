Here's the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        // Initialize the iterator
        int i = 0;

        // Calculate the highest power of k that divides n
        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        // Print the result
        System.out.println(i);
    }
}
```

Here, the `Scanner` is used to read the input from the user (in this case, the test input "11 2"), and we then perform a while loop, similar to the Python code, that keeps incrementing `i` until `n / k^i` equals 0. Finally, we print out the result `i`.
