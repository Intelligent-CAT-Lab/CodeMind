<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
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

This Java code does the same thing as the Python code. It reads two integers from the user, then it iterates twice, each time adding the maximum of the two numbers to a variable `c` and decrementing the smaller number by one. Finally, it prints the value of `c`.<｜end▁of▁sentence｜>
