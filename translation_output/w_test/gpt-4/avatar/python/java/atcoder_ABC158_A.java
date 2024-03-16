Here is the translated Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = s.contains("A") && s.contains("B") ? "Yes" : "No";
        System.out.println(result);
    }
}
```

And here's how you would run a sample test case with the input "BBA" in Java:

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:"); // Prompt the user for input

    String s = scanner.next();
    String result = s.contains("A") && s.contains("B") ? "Yes" : "No";

    System.out.println(result); // Should output "Yes" for the input "BBA"
}
```
