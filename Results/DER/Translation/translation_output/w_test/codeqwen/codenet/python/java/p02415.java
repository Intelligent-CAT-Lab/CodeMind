Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.toLowerCase());
    }
}
```

This Java code reads a string from the user, converts all the uppercase letters to lowercase, and prints the result. The `toLowerCase()` method is used to convert all the uppercase letters in the string to lowercase.
