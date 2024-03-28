<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int, input().split())
print('win' if a+b+c<22 else 'bust')
```

### Hints

- [ ] Use the `Scanner` class to read the input.
- [ ] Use the `System.out.println()` method to print the output.
- [ ] Use the `String.split()` method to split the input.
- [ ] Use the `Integer.parseInt()` method to convert the input to an integer.
- [ ] Use the `Map` class to store the results.
- [ ] Use the `if` statement to check the condition.
- [ ] Use the `else` statement to print the output.

### Solution

```java
import java.util.Scanner;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        for (String s : split) {
            map.put(s, Integer.parseInt(s));
        }
        if (map.get("win") + map.get("bust") < 22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```
</s>
