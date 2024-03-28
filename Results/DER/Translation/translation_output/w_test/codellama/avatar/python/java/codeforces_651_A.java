<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 25

Expected output:
122


```
a1 , a2 = map ( int , input ( ) . split ( ) )
t = 0
if a1 == 1 and a2 == 1 :
    print ( 0 )
else :
    while a1 > 0 and a2 > 0 :
        if a1 > a2 :
            a2 += 1
            a1 -= 2
        else :
            a2 -= 2
            a1 += 1
        t += 1
    print ( t )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int t = 0;
        if (a1 == 1 && a2 == 1) {
            System.out.println(0);
        } else {
            while (a1 > 0 && a2 > 0) {
                if (a1 > a2) {
                    a2 += 1;
                    a1 -= 2;
                } else {
                    a2 -= 2;
                    a1 += 1;
                }
                t += 1;
            }
            System.out.println(t);
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two integers.
* The `map()` method is used to convert the input strings to integers.
* The `t` variable is used to keep track of the number of iterations.
* The `while` loop is used to iterate until either `a1` or `a2` becomes 0.
* The `if` statement is used to check if `a1` and `a2` are both 1, in which case the output is 0.
* The `else` block is used to handle the case where `a1` and `a2` are not both 1.
* The `while` loop is used to iterate until either `a1` or `a2` becomes 0.
* The `if` statement is used to check if `a1` is greater than `a2`, in which case `a2` is incremented and `a1` is decremented by 2.
* The `else` block is used to check if `a2` is greater than `a1`, in which case `a1` is incremented and `a2` is decremented by 2.
* The `t` variable is incremented by 1 in each iteration.
* The `System.out.println()` method is used to print the final value of `t`.</s>
