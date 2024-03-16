Here is the equivalent Java code for the Python code you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.equals(n.toUpperCase()) && !n.equals(n.toLowerCase())) {
            System.out.println("A");
        } else if (n.equals(n.toLowerCase()) && !n.equals(n.toUpperCase())) {
            System.out.println("a");
        }
        
        scanner.close();
    }
}
```

A few things to note about this translation:

1. In Java, input is usually read using the `Scanner` class.
2. The method `isUpperCase()` or `isLowerCase()` that you use in Python to check the case of a string does not directly exist for `String` objects in Java. Instead, you need to compare the original string to its uppercased or lowercased version to determine if it was originally uppercase or lowercase. This comparison also involves ensuring that the string is not equivalent when changed to the opposite case, to avoid a situation where the string contains characters that have no case (e.g., numbers or punctuation).
3. In Java, strings are compared using the `.equals()` method rather than `==` which is used for primitive data types.
4. I've added closing of the `scanner` at the end to prevent resource leaks, which is considered good practice.
