Here's the translation of your Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
```

To test the Java code with the input "ABA", you would run the `Main` class, enter "ABA" into the console when prompted, and the program should output "Yes". Please note that Java is a statically typed language, so you must always specify the type of a variable when you declare it, which is not the case in Python.
