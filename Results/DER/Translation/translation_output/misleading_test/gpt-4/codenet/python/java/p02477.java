Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
        scanner.close();
    }
}
```

In your test case with the input 5 8, you would run this Java code and input the numbers when prompted. The expected output of -55 will be printed to the console only if the input numbers are such that their product is -55; with 5 and 8, the output would be 40. If you expect an output of -55, your input should be such that one of the numbers is negative and their product results in -55 (e.g., -11 and 5).
