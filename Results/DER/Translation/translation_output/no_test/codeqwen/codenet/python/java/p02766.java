Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int i = 0;

        while (n / (int) Math.pow(k, i) != 0) {
            i += 1;
        }

        System.out.println(i);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the number of times the first integer can be divided by the second integer until it becomes 0, and then prints the result.
