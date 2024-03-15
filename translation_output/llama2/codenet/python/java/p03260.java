<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())
print("Yes" if a % 2 != 0 and b % 2 != 0 else "No")

```

### Hint

- Use the `Scanner` class to read the input.
- Use the `String` class to split the input.
- Use the `int` class to convert the input to integer.
- Use the `map` function to convert the input to integer.
- Use the `print` function to print the output.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int a = Integer.parseInt(inputArray[0]);
        int b = Integer.parseInt(inputArray[1]);
        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
</s>
