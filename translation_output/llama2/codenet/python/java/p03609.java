<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)
```

### Hint

- Use the `Scanner` class to read the input.
- Use the `System.out.print()` method to print the output.
- Use the `Integer` class to convert the input to an integer.
- Use the `Math.abs()` method to get the absolute value of a number.
- Use the `if` statement to check the condition.
- Use the `else` statement to print the output if the condition is not satisfied.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        System.out.print(x-t if x-t > 0 else 0);
    }
}
```
</s>
