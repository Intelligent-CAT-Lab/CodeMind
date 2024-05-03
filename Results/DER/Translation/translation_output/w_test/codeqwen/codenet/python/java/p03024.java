Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int a = 0;
        for (char i : x.toCharArray()) {
            if (i == 'x') {
                a += 1;
            }
        }
        System.out.println(a <= 7 ? "YES" : "NO");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of 'x' characters in the string, and then prints "YES" if the count is less than or equal to 7, and "NO" otherwise.
