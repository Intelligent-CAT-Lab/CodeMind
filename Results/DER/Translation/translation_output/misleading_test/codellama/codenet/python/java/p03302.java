<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 11

Expected output:
+

```
a,b=map(int,input().split())
if a+b == 15:
    print('+')
elif a*b == 15:
    print('*')
else:
    print('x')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b == 15) {
            System.out.println("+");
        } else if (a * b == 15) {
            System.out.println("*");
        } else {
            System.out.println("x");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the input. The `split()` method is used to split the input into two integers. The `map()` method is used to convert the input into integers. The `if` statement is used to check if the sum of the two integers is equal to 15, and the `else if` statement is used to check if the product of the two integers is equal to 15. If neither of these conditions are true, the `else` statement is executed and the output is "x".</s>
