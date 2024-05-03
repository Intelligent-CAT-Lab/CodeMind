Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String a = parts[0];
        String b = parts[1];
        b = b.charAt(0) + b.substring(2);
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        System.out.println(aInt * bInt / 100);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, performs the multiplication and division operation, and prints the result.
