Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        while(N > 0) {
            N -= 1;
            res.append((char)('a' + N % 26));
            N /= 26;
        }
        System.out.println(res.reverse().toString());
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, then it calculates the corresponding string and prints it out. The `StringBuilder` class is used to build the string, and the `reverse()` method is used to reverse the string before printing it out.
