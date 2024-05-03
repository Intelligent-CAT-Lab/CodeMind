Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < k; i++) {
            s.append("ACL");
        }
        System.out.println(s.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, appends "ACL" to a StringBuilder object k times, and then prints the resulting string.
