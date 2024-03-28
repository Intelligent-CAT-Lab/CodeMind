<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
a

```
a,b = map(int, input().split())
if a < b:
    print('a < b')
elif a > b:
    print('a > b')
else:
    print('a == b')

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
```

Note: The `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `if` statement is used to compare the values of `a` and `b`, and the `else if` statement is used to check if `a` is greater than `b`. The `else` statement is used to print "a == b" if the values of `a` and `b` are equal.</s>
