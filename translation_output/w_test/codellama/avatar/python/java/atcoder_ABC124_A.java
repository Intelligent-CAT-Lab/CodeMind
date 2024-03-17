<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 6

Expected output:
12


```
a , b = map ( int , input ( ) . split ( ) )
c = 0
for i in range ( 2 ) :
    c += max ( a , b )
    if a >= b :
        a -= 1
    else :
        b -= 1
print ( c )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a--;
            } else {
                b--;
            }
        }
        System.out.println(c);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `Math.max()` method is used to find the maximum of two numbers.
* The `for` loop is used to iterate over the range of 2.
* The `if` statement is used to check if `a` is greater than or equal to `b`. If it is, then `a` is decremented by 1. Otherwise, `b` is decremented by 1.
* The `c` variable is incremented by the maximum of `a` and `b` in each iteration of the loop.
* The `System.out.println()` method is used to print the final value of `c`.</s>
