<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a = [int(i) for i in input().split()]
if a[0] == a[1]:
  print('Yes')
else:
  print('No')
```

### Hints

- Use the `String` class to split the input into a list of `String`s.
- Use the `int` class to convert each `String` to an `int`.
- Use the `if` statement to check if the first and second elements of the list are equal.
- Use the `print` statement to output the result.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[2];
        a[0] = Integer.parseInt(scanner.nextLine());
        a[1] = Integer.parseInt(scanner.nextLine());
        if (a[0] == a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
</s>
