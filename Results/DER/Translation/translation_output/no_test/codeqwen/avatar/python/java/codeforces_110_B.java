Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("abcd");
        }
        sb.append("abc".substring(0, n % 4));
        System.out.println(sb.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, then prints a string of "abcd" repeated n/4 times, followed by the first n%4 characters of "abc".
