<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 896 7

Expected output:
-65

```
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


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

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
                        x++;
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
                            x--;
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
Note: The code uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of a number. The `Integer.parseInt()` method is used to convert the input strings to integers.</s>
