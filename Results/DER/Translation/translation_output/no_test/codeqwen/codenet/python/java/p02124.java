Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiplier = number / 100;
        String result = "ai1333" + "3".repeat(multiplier);
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the number of times "3" should be repeated, and then concatenates the string "ai1333" with the repeated "3". The `repeat()` method is used to repeat the string a certain number of times in Java.
