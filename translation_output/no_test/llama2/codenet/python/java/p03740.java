<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```

### Hints

- Use the `Scanner` class to read the input.
- Use the `String` class to split the input.
- Use the `int` class to convert the input to integer.
- Use the `if` statement to check the condition.
- Use the `print` statement to print the output.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }
    }
}
```
</s>
