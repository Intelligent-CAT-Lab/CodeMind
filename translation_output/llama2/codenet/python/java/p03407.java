<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")
```

### Hints

- Use the `Scanner` class to read the input.
- Use the `System.out.println()` method to print the output.
- Use the `int` type to store the input.
- Use the `+` operator to add two numbers.
- Use the `if` statement to check if a condition is true or false.
- Use the `else` statement to execute a block of code if the `if` statement is false.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```
</s>
