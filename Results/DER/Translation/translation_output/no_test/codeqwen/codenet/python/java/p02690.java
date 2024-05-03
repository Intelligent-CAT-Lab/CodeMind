Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (i * i * i * i * i - j * j * j * j * j == x) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it iterates over all possible pairs of integers between -1000 and 1000. If the sum of the fifth powers of the two integers equals the input number, it prints the pair and returns from the program. If no such pair is found, it simply returns from the program without printing anything.
