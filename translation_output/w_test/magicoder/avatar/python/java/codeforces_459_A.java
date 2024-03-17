<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 0 0 4

Expected output:
4 4 0 0


```
anti , b , c , d = map ( int , input ( ) . split ( ) )
l = abs ( anti - c ) ; m = abs ( b - d )
if anti == c : print ( anti + m , b , c + m , d )
elif b == d : print ( anti , b + l , c , d + l )
elif l != m : print ( - 1 )
else : print ( anti , d , c , b )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        int l = Math.abs(a - c);
        int m = Math.abs(b - d);

        if (a == c) {
            System.out.println(a + m + " " + b + " " + c + m + " " + d);
        } else if (b == d) {
            System.out.println(a + " " + b + l + " " + c + " " + d + l);
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(a + " " + d + " " + c + " " + b);
        }
    }
}
```

This Java code reads the input from the user, splits it into four parts, and then converts each part into an integer. It then calculates the absolute difference between `a` and `c` and between `b` and `d`. It then checks the conditions and prints the result accordingly.<｜end▁of▁sentence｜>
