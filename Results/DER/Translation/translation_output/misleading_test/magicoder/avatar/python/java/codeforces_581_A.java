<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
45 99

Expected output:
47 20

```
x = list ( input ( ) . split ( ) )
for i in range ( len ( x ) ) :
    x [ i ] = int ( x [ i ] )
a = x [ 0 ]
b = x [ 1 ]
print ( min ( x ) , end = " â " )
if abs ( a - b ) >= 2 :
    print ( abs ( a - b ) // 2 )
else :
    print ( 0 )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] x = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
        int a = x[0];
        int b = x[1];
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.print(min + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, stores them in an array, and then finds the minimum value in the array. It then prints the minimum value and the difference between the two numbers divided by 2 if the difference is greater than or equal to 2, otherwise it prints 0.<｜end▁of▁sentence｜>
