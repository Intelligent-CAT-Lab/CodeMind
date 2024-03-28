<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
Yes


```
a, b = map(int, input().split())
print("Yes" if a % 2 != 0 and b % 2 != 0 else "No")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement is used to check if the input is odd.
* The `print()` method is used to print the output.

Note: The `map()` function in Python is not available in Java, so we have to use the `Scanner` class to read input from the user.</s>
