Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class MaxOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int result = Math.max(Math.max(a + b, a - b), a * b);
        System.out.println(result);
    }
}
```

To compile and execute the code above with the provided test input (`3 1`), you can use a Java environment. Given this input, the Java program will produce the expected output, which is `4`.
