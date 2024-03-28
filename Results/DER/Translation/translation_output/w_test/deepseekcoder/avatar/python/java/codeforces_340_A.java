<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

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

        int gcd = GCD(x, y);
        int lcm = LCM(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    private static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    private static int LCM(int a, int b) {
        return a * (b / GCD(a, b));
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, calculates the greatest common divisor (GCD) and least common multiple (LCM) of the first two integers, and then prints the difference between the integer division of the fourth integer by the LCM and the integer division of the third integer minus one by the LCM.
<|EOT|>
