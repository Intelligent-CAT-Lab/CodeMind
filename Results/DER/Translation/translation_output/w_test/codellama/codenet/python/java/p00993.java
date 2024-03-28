<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8
2
3


```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result + 2);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}
```
This code first reads an integer `n` from the user using the `Scanner` class. It then calculates the factorial of `n` using a loop and stores the result in the variable `result`. Finally, it prints the result and the numbers from 1 to `n` with an additional 1 added to each number.

Note that the `raw_input()` function in Python is replaced by the `Scanner` class in Java, which allows the user to input a string or an integer. The `nextInt()` method is used to read an integer from the user.</s>
