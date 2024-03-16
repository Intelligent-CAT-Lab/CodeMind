Certainly! Below is the equivalent Java code for the given Python script, which reads an integer from standard input and outputs the result of the bitwise operation `(n+1) & -(n+1)`:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n+1) & -(n+1));
        scanner.close();
    }
}
```

To run a test with this Java code, compile and execute it using a Java environment. Provide `2` as input when prompted, and it will output `1`, same as the expected output mentioned in your test case.
