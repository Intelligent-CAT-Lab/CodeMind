Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'x') {
                a++;
            }
        }
        System.out.println(a <= 7 ? "NO" : "YES");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of 'x' characters in the string, and then prints "NO" if the count is less than or equal to 7, and "YES" otherwise.
