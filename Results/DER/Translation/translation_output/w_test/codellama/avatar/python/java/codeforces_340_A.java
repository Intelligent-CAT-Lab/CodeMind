<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class GCDLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int gcd = gcd(x, y);
        int lcm = lcm(x, y);

        int result = b / lcm - (a - 1) / lcm;

        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            a = b;
            b = a % b;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```
Note: The code is written in Java 8, and it uses the `Scanner` class to read the input from the user. The `gcd` and `lcm` functions are defined separately, and they are used to calculate the greatest common divisor and the least common multiple of two numbers, respectively. The `main` function reads the input from the user, calculates the greatest common divisor and the least common multiple, and then calculates the result using the formula provided in the problem statement. Finally, it prints the result to the console.</s>
