<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 4

Expected output:
YES


```
a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into three parts, separated by spaces.
* The `map()` method is used to convert the input strings to integers.
* The `if` statement is used to check if the condition `a <= x && a + b >= x` is true, and print "YES" if it is, and "NO" otherwise.

Note: The `Scanner` class is used instead of `System.in` because it provides more functionality and is more convenient to use.</s>
