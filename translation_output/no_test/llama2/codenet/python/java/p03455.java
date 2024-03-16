<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())
c = a * b
if c % 2 == 1:
    print('Odd')
else:
    print('Even')
```

### Hints

- Use the `Scanner` class to read the input.
- Use the `Integer` class to convert the input to an integer.
- Use the `*` operator to multiply two integers.
- Use the `%` operator to check if the result of the multiplication is odd or even.
- Use the `if` statement to check if the result is odd or even.
- Use the `print` statement to output the result.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
```
</s>
