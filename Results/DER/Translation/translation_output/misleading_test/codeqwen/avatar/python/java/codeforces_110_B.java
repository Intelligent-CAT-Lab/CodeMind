Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("abcd");
        }
        sb.append("abc".substring(0, n % 4));
        System.out.println(sb.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, then it creates a StringBuilder object, appends "abcd" to it n/4 times, and then appends the first n%4 characters of "abc" to it. Finally, it prints the resulting string.
