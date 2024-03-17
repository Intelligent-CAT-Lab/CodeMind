<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
360


```
X = int ( input ( ) )
i = 1
a = 0
while True :
    a = a + X
    if a % 360 == 0 :
        print ( i )
        break
    i += 1


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int i = 1;
        int a = 0;
        while (true) {
            a += X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `while` loop is used to iterate until the condition is met.
* The `a += X` statement is used to add the input value to the variable `a`.
* The `if` statement is used to check if the value of `a` is divisible by 360.
* The `break` statement is used to exit the loop if the condition is met.
* The `System.out.println(i)` statement is used to print the value of `i` if the condition is met.

Note: The `break` statement is used to exit the loop if the condition is met, so the loop will only iterate once. If you want to iterate multiple times, you can remove the `break` statement and add a `continue` statement after the `System.out.println(i)` statement.</s>
