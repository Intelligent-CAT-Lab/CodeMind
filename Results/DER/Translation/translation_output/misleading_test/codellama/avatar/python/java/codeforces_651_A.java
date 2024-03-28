<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 25

Expected output:
156

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
* The `if` statement checks if the input is equal to 1 and 1, if it is, it prints 0 and exits the loop.
* The `while` loop checks if both `a1` and `a2` are greater than 0, if they are, it executes the loop.
* The `if` statement inside the loop checks if `a1` is greater than `a2`, if it is, it adds 1 to `a2` and subtracts 2 from `a1`. If `a2` is greater than `a1`, it subtracts 2 from `a2` and adds 1 to `a1`.
* The `t` variable is incremented by 1 after each iteration of the loop.
* The `System.out.println(t)` statement prints the final value of `t` which is the number of iterations required to make `a1` and `a2` equal.

Note: The code is written in Java 8, if you are using an older version of Java, you may need to modify the code accordingly.</s>
