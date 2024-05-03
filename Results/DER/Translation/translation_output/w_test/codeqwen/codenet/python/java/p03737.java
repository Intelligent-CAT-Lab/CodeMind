Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next().toUpperCase();
        String s2 = scanner.next().toUpperCase();
        String s3 = scanner.next().toUpperCase();
        System.out.println(s1.charAt(0) + "" + s2.charAt(0) + "" + s3.charAt(0));
    }
}
```

This Java code does the same thing as the Python code. It reads three strings from the user, converts them to uppercase, and then prints the first character of each string. The `charAt(0)` method is used to get the first character of a string in Java. The `+ ""` is used to convert the character to a string before concatenating it with the other strings.
