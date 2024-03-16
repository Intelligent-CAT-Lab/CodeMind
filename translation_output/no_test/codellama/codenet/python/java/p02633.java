<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x = int(input())

for i in range(1, 10**5):
    if 360 * i % x == 0:
        print(360 * i // x)
        break

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= 100000; i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `for` loop iterates from 1 to 100000, and the `if` statement checks if 360 times the current value of `i` is divisible by `x`. If it is, the `println()` method is used to print the result, and the `break` statement is used to exit the loop.</s>
