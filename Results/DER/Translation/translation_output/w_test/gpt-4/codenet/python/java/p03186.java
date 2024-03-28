Below is the translated Java code for the given Python snippet. I've encapsulated it in a `main` method and used a `Scanner` for user input:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (c <= a + b + 1) {
            System.out.println(b + c);
        } else {
            System.out.println(a + 2 * b + 1);
        }
    }
}
```

When running the Java code, you would provide the test input (e.g., `3 1 4`) to the console when prompted, and the code should produce the expected output `5`.
