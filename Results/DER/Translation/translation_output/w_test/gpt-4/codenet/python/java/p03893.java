Here is the Python code translated to Java, including a simple test case with the input 2:

```java
import java.util.Scanner;

public class SequenceCalculator {
    public static void main(String[] args) {
        final int MAX_SIZE = 50;
        int[] g = new int[MAX_SIZE];
        int[] h = new int[MAX_SIZE];
        h[1] = 3;
        g[1] = 6;

        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }

        System.out.println(g[X]);
        scanner.close();
    }
}
```

To test the case for input 2, you would execute the above code and input 2 when prompted. The program would provide the expected output of 14.

Note: Unlike Python, Java is statically typed and requires defining the size of arrays upon creation, so be sure to make `MAX_SIZE` large enough for your intended use cases or manage array resizing dynamically if needed. Additionally, Java uses `Scanner` for input by default, and it is important to close the `Scanner` object to avoid potential resource leaks.
