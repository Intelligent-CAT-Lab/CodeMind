Here is the equivalent Java code for the provided Python example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] g = new int[50];
        int[] h = new int[50];
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

To run a test with the input `2`, you would need to compile and run the `Main` class and enter `2` when prompted. It will then display the expected output `-85`.
