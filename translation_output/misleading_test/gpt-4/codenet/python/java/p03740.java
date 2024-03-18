Below is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.abs(x - y) <= 1 ? "Brown" : "Alice");
        scanner.close();
    }
}
```

To test this code with the provided test input, you will need to run the `Main` class and provide the input `2 1` to the console. The program should then output `Brown`, which matches the expected output.
