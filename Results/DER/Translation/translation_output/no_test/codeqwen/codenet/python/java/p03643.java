Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("ABC" + s);
    }
}
```

In this Java code, we are using `Scanner` class to take input from the user. The `nextLine()` method is used to read the input as a string. Then we are printing "ABC" concatenated with the input string.
