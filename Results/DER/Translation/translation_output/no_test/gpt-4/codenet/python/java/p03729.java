Here is the equivalent Java code for the given Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

Note that Java is more verbose than Python and requires specific type declarations as well as proper input handling. In Java, we need to create a `Scanner` object to read input from the user and then store the inputs into separate string variables. We can use the `charAt()` method to compare specific characters in the strings. Java also requires that this code be encapsulated within a class, in this case, named `Main`.
