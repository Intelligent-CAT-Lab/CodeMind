Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(S.startsWith("YAKI") ? "Yes" : "No");
        scanner.close();
    }
}
```

This Java code will work similarly to the Python code, checking if the input string starts with "YAKI" and printing "Yes" if it does, or "No" if it doesn't.
