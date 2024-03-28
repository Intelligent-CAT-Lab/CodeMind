Here is the equivalent Java code for the provided Python script.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1000) {
            System.out.print("ABC");
        } else {
            System.out.print("ABD"); // In Java, println would add a newline. Using print to match the Python output.
        }
        scanner.close();
    }
}
```

To match your test case in Java, if you run this Java program and input `999`, the output will be `ABC` as expected.
