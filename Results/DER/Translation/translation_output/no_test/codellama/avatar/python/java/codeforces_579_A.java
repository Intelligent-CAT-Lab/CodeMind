<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

import math
n = int ( input ( ) )
x = 1
while math . log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math . log2 ( n ) ) )
print ( x )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log2(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log2(n));
        }
        System.out.println(x);
    }
}
```
Note that the `Math.log2()` method in Java returns the base-2 logarithm of a number, which is equivalent to the `math.log2()` method in Python. The `Math.pow()` method in Java raises a number to a power, which is equivalent to the `**` operator in Python.</s>
