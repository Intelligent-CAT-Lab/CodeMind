Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (A >= 13) {
            System.out.println(B);
        } else if (6 <= A && A <= 12) {
            System.out.println(B / 2);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then checks if the first integer is greater than or equal to 13. If it is, it prints the second integer. If the first integer is between 6 and 12 inclusive, it prints the second integer divided by 2. If the first integer is less than 6, it prints 0.
