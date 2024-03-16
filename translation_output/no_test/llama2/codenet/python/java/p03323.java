<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
if a<9 and b<9:
    print("Yay!")
else:
    print(":(")
```

### Hints

- Use the `Scanner` class to read the input.
- Use the `Integer` class to convert the input to an integer.
- Use the `String` class to convert the input to a string.
- Use the `split` method to split the string into a list of strings.
- Use the `map` method to convert the list of strings to a list of integers.
- Use the `if` statement to check if the condition is true.
- Use the `print` statement to output the result.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
```
</s>
