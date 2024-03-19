<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6

Expected output:
-28

```
s, c = map(int, input().split())

print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();

        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `map()` method is used to convert the two parts of the input string into integers.
* The `print()` method is used to print the result to the console.
* The `if` statement is used to check if the condition `s * 2 <= c` is true, and if it is, the result is printed. If the condition is false, the result is not printed.
* The `else` statement is used to print the result if the condition is false.

Note: The `//` operator is used for integer division in Java, which returns the integer part of the result.</s>
