Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, performs the division and multiplication as in your Python code, and then prints the result.
