Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count / 2.0));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then enters a loop that doubles the count until it is greater than the input number. After the loop, it prints the result of dividing the final count by 2 and rounding it to the nearest integer.
