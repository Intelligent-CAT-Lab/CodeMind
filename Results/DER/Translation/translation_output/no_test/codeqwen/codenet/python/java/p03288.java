Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 1200) {
            System.out.println("ABC");
        } else if(n < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's less than 1200, less than 2800, or greater than or equal to 2800, and prints the corresponding string.
