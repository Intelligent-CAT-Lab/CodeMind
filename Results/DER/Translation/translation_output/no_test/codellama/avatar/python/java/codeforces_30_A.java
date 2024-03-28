<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

M = list ( map ( int , input ( ) . split ( ' â ' ) ) )
a = M [ 0 ]
b = M [ 1 ]
n = M [ 2 ]
if a != 0 :
    if b % a != 0 :
        print ( ' No â solution ' )
    else :
        b = b // a
        x , y = 0 , - 2000
        if b >= 0 :
            while y < b :
                y = pow ( x , n )
                x = x + 1
            if y > b :
                print ( ' No â solution ' )
            else :
                print ( x - 1 )
        else :
            if n % 2 == 0 :
                print ( ' No â solution ' )
            else :
                x = - 1
                y = 2000
                while y > b :
                    y = pow ( x , n )
                    x = x - 1
                if y < b :
                    print ( ' No â solution ' )
                else :
                    print ( x + 1 )
else :
    if b == 0 :
        print ( 5 )
    else :
        print ( ' No â solution ' )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] M = new int[3];
        for (int i = 0; i < 3; i++) {
            M[i] = scanner.nextInt();
        }
        int a = M[0];
        int b = M[1];
        int n = M[2];
        if (a != 0) {
            if (b % a != 0) {
                System.out.println("No solution");
            } else {
                b = b / a;
                int x = 0;
                int y = -2000;
                if (b >= 0) {
                    while (y < b) {
                        y = (int) Math.pow(x, n);
                        x = x + 1;
                    }
                    if (y > b) {
                        System.out.println("No solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (n % 2 == 0) {
                        System.out.println("No solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > b) {
                            y = (int) Math.pow(x, n);
                            x = x - 1;
                        }
                        if (y < b) {
                            System.out.println("No solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No solution");
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of a number. The `int` type is used to represent integer values, and the `double` type is used to represent floating-point values.</s>
