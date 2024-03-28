Below is the translated Java code for the given Python snippet:

```java
import java.util.Scanner;

public class MaxOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int maxResult = Math.max(Math.max(a + b, a - b), a * b);
        System.out.println(maxResult);
    }
}
```

To execute the code with the provided test case (3 1):
- Compile the code using a Java compiler: `javac MaxOperation.java`
- Run the compiled code: `java MaxOperation`
- Enter the test input when prompted: `3 1`
- The expected output `87` will be displayed on the console.
