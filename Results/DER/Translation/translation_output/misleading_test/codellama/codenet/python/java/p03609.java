<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 17

Expected output:
43

```
x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int result = x - t;
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `split()` method is used to split the input into two integers.
* The `map()` method is used to convert the input into integers.
* The `print()` method is used to print the result.
* The `if-else` statement is used to check if the result is greater than 0, and if it is, it prints the result, otherwise it prints 0.</s>
