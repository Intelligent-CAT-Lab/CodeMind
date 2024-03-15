Certainly! Below is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();

        int result = (int)Math.ceil((double)h / a);
        System.out.println(result);
    }
}
```

This will take two integers from the standard input, calculate the ceiling of their division, and print the result.
