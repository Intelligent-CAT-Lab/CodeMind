In Java, we'll need to use a Scanner to read the input, and replace the Python comprehension with nested loops to sum the number of solutions. Here's how the Python code translates to Java:

```java
import java.util.Scanner;

public class SumCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int count = 0;

        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (s - y - z >= 0 && s - y - z <= k) {
                    count++;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
```

You can compile and run this Java program, input `2 2`, and it will output `6`, matching the expected output from the Python code example.
