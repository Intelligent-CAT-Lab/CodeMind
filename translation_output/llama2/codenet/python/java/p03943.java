<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c = map(int, input().split())

ans = "No"
if a + b == c:
  ans = "Yes"
if a + c == b:
  ans = "Yes"
if b + c == a:
  ans = "Yes"

print(ans)
```

### Hint

- Use the `Scanner` class to read the input.
- Use the `String` class to store the input.
- Use the `int` class to store the input as an integer.
- Use the `map` function to convert the input to an integer.
- Use the `if` statement to check if the condition is true.
- Use the `print` statement to print the output.

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
        int c = Integer.parseInt(inputArray[2]);

        String ans = "No";
        if (a + b == c) {
            ans = "Yes";
        }
        if (a + c == b) {
            ans = "Yes";
        }
        if (b + c == a) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```
</s>
