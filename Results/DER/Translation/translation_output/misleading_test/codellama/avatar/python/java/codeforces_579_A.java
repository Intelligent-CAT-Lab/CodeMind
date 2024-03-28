<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
-12

```
import math
n = int ( input ( ) )
x = 1
while math . log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math . log2 ( n ) ) )
print ( x )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log2(n) % 1 != 0) {
            x += 1;
            n -= (int) Math.pow(2, (int) Math.log2(n));
        }
        System.out.println(x);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `log2` method is used to calculate the logarithm of the input number to the base 2, and the `pow` method is used to calculate the power of 2 to the logarithm. The `while` loop continues to run until the logarithm is an integer, at which point the loop exits and the value of `x` is printed.</s>
