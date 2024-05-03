Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >= 65 && n <= 90) {
            System.out.println("1");
        } else if(n >= 97 && n <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's in the range for uppercase letters (65-90), lowercase letters (97-122), or neither, and prints the corresponding number.
