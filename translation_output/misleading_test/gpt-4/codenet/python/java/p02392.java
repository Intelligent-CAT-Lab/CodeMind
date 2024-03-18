Here is the Java equivalent of the provided Python code, including how to handle input and output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integers from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Check if a < b < c and print the result
        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

You can run this Java class and provide the input `1 3 8` to test it. The expected output will be `Yes` (with the correct spelling according to the Python code provided). Please note that in the given Python code, "Yes" is spelled as "Yesh" in the expected output, but I presumed this is a typo, so in the Java translation, I used the correct spelling "Yes". If "Yesh" was intentional, you should replace `"Yes"` with `"Yesh"` in the `System.out.println()` call to get the exact same output as in your Python code example.
