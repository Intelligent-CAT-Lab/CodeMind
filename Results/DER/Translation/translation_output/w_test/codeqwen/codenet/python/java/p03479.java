Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 1;
        int x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then it calculates the number of times the first number can be doubled until it is greater than or equal to the second number. It then prints out the number of times this doubling operation was performed.
