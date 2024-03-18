Certainly! Here's the translated Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        int result = x - t > 0 ? x - t : 0;
        System.out.println(result);
    }
}
```

This Java code segment implements the same logic as the Python code and will output `43` when given the input `100 17` as specified in the test case.
