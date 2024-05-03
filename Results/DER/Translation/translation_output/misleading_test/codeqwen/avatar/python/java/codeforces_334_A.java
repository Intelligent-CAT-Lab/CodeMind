Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then uses a while loop to print pairs of numbers, starting from 1 and ending at `n * n`. The first number in each pair is `i`, and the second number is `j`. The loop continues until `i` is no longer less than `j`.
