<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class MinDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] x = scanner.nextLine().split(" ");
        int[] xInt = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            xInt[i] = Integer.parseInt(x[i]);
        }
        int a = xInt[0];
        int b = xInt[1];
        System.out.print(Math.min(a, b) + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.print(Math.abs(a - b) / 2);
        } else {
            System.out.print(0);
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.min` and `Math.abs` methods to calculate the minimum difference and the absolute value of the difference between the two numbers. The `Integer.parseInt` method is used to convert the input strings to integers.</s>
