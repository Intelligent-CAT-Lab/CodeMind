<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()

if n.isupper():
    print("A")
elif n.islower():
    print("a")
```

### Hints

- Use the `isupper()` and `islower()` methods of the `str` class.
- Use the `input()` function to read the user's input.
- Use the `print()` function to print the result.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.toUpperCase().equals(n)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
```
</s>
