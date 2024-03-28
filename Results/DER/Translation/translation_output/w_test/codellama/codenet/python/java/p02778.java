<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
sardine

Expected output:
xxxxxxx


```
ni = lambda: int(input())
nm = lambda: map(int, input().split())
nl = lambda: list(map(int, input().split()))

s = input()

for i in range(len(s)):
  print('x',end='')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `length()` method is used to get the length of the input string.
* The `for` loop is used to iterate over the characters in the input string.
* The `print()` method is used to print the output.

Note: The `print()` method in Java is used to print to the console, and it does not have an `end` parameter like the `print()` function in Python. Therefore, the `print()` method in Java is used to print a newline character (`\n`) after each iteration of the loop, which is equivalent to the `end` parameter in Python.</s>
