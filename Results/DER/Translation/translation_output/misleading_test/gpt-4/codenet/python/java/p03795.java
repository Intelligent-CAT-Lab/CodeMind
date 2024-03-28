Here's the translation of the provided Python code into Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(800 * N - 200 * (N / 15));
        scanner.close();
    }
}
```

To run the code, you would input the test case data (20) when prompted, and the expected output would be the same as in Python (15796). Remember, when running the Java program, it expects input from the standard input, so you'll need to type the number and press enter to see the result.
