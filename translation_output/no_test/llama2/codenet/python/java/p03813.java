<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```

### Hints

- Use the `System.out.print()` method to print the string.
- Use the `System.in.readLine()` method to read the input.
- Use the `Integer.parseInt()` method to convert the input to an integer.
- Use the `if` statement to check the condition.
- Use the `else` statement to print the string.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("ABC" + (a < 1200 ? "" : "ARC"));
    }
}
```
</s>
