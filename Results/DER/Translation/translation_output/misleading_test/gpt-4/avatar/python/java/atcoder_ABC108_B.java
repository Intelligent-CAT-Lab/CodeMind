To translate the provided Python code to Java, we would typically read the inputs using a `Scanner` object, perform the calculations, and then print the results. Here's the Java code enclosed in triple backticks:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading inputs
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        // Performing calculations
        int a = x2 - x1;
        int b = y2 - y1;
        
        // Printing the results
        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
        
        scanner.close();
    }
}
```

When you run this program and input `2 3 6 6`, the output will be `3 10 -1 7`.
