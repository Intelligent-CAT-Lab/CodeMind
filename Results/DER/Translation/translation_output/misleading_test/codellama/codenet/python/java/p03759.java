<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 4 6

Expected output:
YAES

```
a,b,c=map(int,input().split())
if b-a==c-b:
  print('YES')
else:
  print('NO')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `split()` method is used to split the input into three integers.
* The `map()` method is used to convert the input into integers.
* The `if` statement is used to check if the difference between `b` and `a` is equal to the difference between `c` and `b`.
* The `print()` method is used to print the output.

Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the input. The `split()` method is used to split the input into three integers. The `map()` method is used to convert the input into integers. The `if` statement is used to check if the difference between `b` and `a` is equal to the difference between `c` and `b`. The `print()` method is used to print the output.</s>
