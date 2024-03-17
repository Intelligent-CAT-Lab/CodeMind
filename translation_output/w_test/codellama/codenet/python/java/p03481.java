<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
3


```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int k = (int) Math.floor(Math.log(Y / X) / Math.log(2));
        System.out.println(k);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it calculates the value of `k` using the formula `(Y // X).bit_length()`. The `bit_length()` method returns the number of bits required to represent the integer `Y // X`, which is equivalent to the number of bits required to represent the integer `Y` divided by the integer `X`. The `Math.log()` method is used to calculate the logarithm of `Y // X` to the base 2, which is equivalent to the number of bits required to represent the integer `Y // X`. Finally, the `Math.floor()` method is used to round the result down to the nearest integer.

Note that this code assumes that the input values `X` and `Y` are positive integers. If the input values can be negative, you may need to add additional checks to ensure that the calculation is performed correctly.</s>
