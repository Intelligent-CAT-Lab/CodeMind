Below is the Java translation of the Python code you've provided along with a sample test case, as per your request. Java has different ways to take input but for this example, I'll assume that the inputs are provided through the standard input stream (console):

```java
import java.util.Scanner;

public class WordChainChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        scanner.close();

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

When you run this Java code and input "rng gorilla apple", it should output "YES" as expected.
