Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            System.out.println(new StringBuilder(l).reverse().toString());
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `StringBuilder` class is used to reverse the string. The `reverse()` method of `StringBuilder` class is used to reverse the string and the `toString()` method is used to convert the `StringBuilder` object back to a `String`.
