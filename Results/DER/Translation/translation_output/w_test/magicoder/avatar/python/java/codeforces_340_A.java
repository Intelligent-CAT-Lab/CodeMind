<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1 1000000000

Expected output:
1000000000

```
def GCD ( a , b ) :
    while a % b != 0 :
        a , b = b , a % b
    return b
def LCM ( a , b ) :
    return a * b // GCD ( a , b )
l = input ( ) . split ( ' â ' )
x , y , a , b = int ( l [ 0 ] ) , int ( l [ 1 ] ) , int ( l [ 2 ] ) , int ( l [ 3 ] )
lcm = LCM ( x , y )
print ( b // lcm - ( a - 1 ) // lcm )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        int lcm = lcm(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the least common multiple (LCM) of the first two integers, and then prints the difference between the integer division of the second integer by the LCM and the integer division of the first integer minus one by the LCM.<｜end▁of▁sentence｜>
