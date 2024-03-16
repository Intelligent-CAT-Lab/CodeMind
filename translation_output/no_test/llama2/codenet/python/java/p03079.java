<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c = map(int, input().split())
if a == b and b == c :
    print("Yes")
else :
    print("No")
```

### Hint

- Use the `Scanner` class to read the input.
- Use the `String` class to split the input.
- Use the `int` class to convert the input to integer.
- Use the `map` function to convert the input to integer.
- Use the `if` statement to check the condition.
- Use the `print` function to print the output.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
</s>
