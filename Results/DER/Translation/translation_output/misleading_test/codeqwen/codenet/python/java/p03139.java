Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        System.out.println(Math.min(A, B) + " " + Math.max(A + B - N, 0));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the minimum and maximum values, and then prints them out. The `Math.min` and `Math.max` functions are used to find the minimum and maximum values, respectively. The `Scanner` class is used to read the input from the user.
