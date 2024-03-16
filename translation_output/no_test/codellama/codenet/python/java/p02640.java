<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x, y = map(int, input().split())
count = 0
for a in range(x+1):
    b = x - a
    if (2*a + 4*b) == y:
        count = 1
        break
    else:
        pass
print("Yes" if count == 1 else "No")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if (2 * a + 4 * b == y) {
                count = 1;
                break;
            }
        }
        System.out.println(count == 1 ? "Yes" : "No");
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `for` loop is used to iterate over the possible values of `a` and `b`, and the `if` statement is used to check if the equation `2 * a + 4 * b == y` is true. If it is true, the `count` variable is set to 1 and the loop is exited. Finally, the `System.out.println()` method is used to print the result.</s>
