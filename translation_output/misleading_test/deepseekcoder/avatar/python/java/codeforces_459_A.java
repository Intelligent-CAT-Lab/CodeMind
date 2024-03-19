<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int l = Math.abs(a - c);
        int m = Math.abs(b - d);
        if (a == c) {
            System.out.println(a + m + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(a + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(a + " " + d + " " + c + " " + b);
        }
    }
}
```

This Java code reads four integers from the standard input, calculates the absolute differences between the first two and the last two, and then prints the appropriate output based on the conditions in the Python code.
<|EOT|>
