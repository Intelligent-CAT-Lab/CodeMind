Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        scanner.close();

        int fare = ab + (bc / 2);
        System.out.println(fare);
    }
}
```

When you run this Java program and provide the input "81 58", the output will be "110" as expected.
