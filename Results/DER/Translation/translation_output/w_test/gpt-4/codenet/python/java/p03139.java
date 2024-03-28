Here is the Java equivalent of the given Python code:

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

You can run this Java code to perform the same operation as the given Python code. Note that this code reads integers from `System.in` using a `Scanner` object, and then it prints the result of the operations directly to the console using `System.out`.

To run the Java code, you would execute it in a Java runtime environment (JRE), and when prompted, you would enter a set of three space-separated integers as your test input (e.g., "10 3 5") to get the expected output, which in the given case would be "3 0".
