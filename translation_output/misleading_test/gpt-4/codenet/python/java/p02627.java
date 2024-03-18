Below is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (Character.isUpperCase(n.charAt(0))) {
            System.out.println("A");
        } else if (Character.isLowerCase(n.charAt(0))) {
            System.out.println("a");
        }
    }
}
```

In this Java code, `Scanner` is used to get the input from the user, and `Character` class methods `isUpperCase` and `isLowerCase` are used to determine whether the input character is an uppercase or lowercase letter. Then, it prints "A" or "a" accordingly.

Here's a sample usage based on your request:

```java
public class Test {
    public static void main(String[] args) {
        simulateInput("B");
    }

    private static void simulateInput(String input) {
        String n = input;

        if (Character.isUpperCase(n.charAt(0))) {
            System.out.println("A");
        } else if (Character.isLowerCase(n.charAt(0))) {
            System.out.println("a");
        }
    }
}
```

Running the `Test` class with `simulateInput("B")` would produce the expected output "A".
