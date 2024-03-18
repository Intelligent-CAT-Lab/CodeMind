Here's the translated Python code to Java:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        
        String[] points = new String[n];
        Arrays.fill(points, "0");
        
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }
        
        System.out.println(String.join(" ", points));
    }
}
```

To test the Java code with the input "3 100", you can use the following approach. You can run the Java `Main` class and provide "3 100" as the standard input. The expected output would be "0 100" as per the original Python code.
