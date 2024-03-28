<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a1 = Integer.parseInt(input[0]);
        int a2 = Integer.parseInt(input[1]);
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

This Java code reads two integers from the standard input, and then it checks if both integers are 1. If they are, it prints 0. Otherwise, it enters a loop where it checks if the first integer is greater than the second one. If it is, it increments the second integer by 1 and decrements the first integer by 2. If the first integer is not greater than the second one, it decrements the second integer by 2 and increments the first integer by 1. It keeps doing this until both integers are less than or equal to 0. After each iteration, it increments the counter `t` by 1. Finally, it prints the value of `t`.<｜end▁of▁sentence｜>
