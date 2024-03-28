<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 0 0 4

Expected output:
4 0 0

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

        int anti = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);

        if (anti == c) {
            System.out.println(anti + m + " " + b + " " + c + m + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + b + l + " " + c + " " + d + l);
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }
    }
}
```

This Java code reads the input from the user, splits it into an array of strings, and then converts each string to an integer. It then calculates the absolute difference between `anti` and `c` and between `b` and `d`. It then checks the conditions and prints the output accordingly.<｜end▁of▁sentence｜>
