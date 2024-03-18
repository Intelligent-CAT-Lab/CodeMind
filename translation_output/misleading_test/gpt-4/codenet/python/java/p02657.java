Below is the Java equivalent of the provided Python code. The code reads two integers from the standard input, multiplies them, and prints the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(L * R);
        scanner.close();
    }
}
```

To run a test case in Java, you would need to manually provide the input in the format specified (e.g., "2 5") when prompted. The output will then be displayed on the console, which should match the expected output given ("56").
