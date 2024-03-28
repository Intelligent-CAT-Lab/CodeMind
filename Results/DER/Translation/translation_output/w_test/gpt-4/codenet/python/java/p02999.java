Here is the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a < b ? 0 : 10);
        scanner.close();
    }
}
```

To run the code using the given test case with input `3 5`, you would run the program, input `3 5` when prompted and the expected output should be `0`.
