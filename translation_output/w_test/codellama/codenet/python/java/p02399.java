<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1 1.50000


```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result = (double) a / b;
        System.out.println(a / b + " " + a % b + " " + result);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two integers.
* The `map()` method is used to convert the input strings to integers.
* The `print()` method is used to print the output.
* The `%d` format specifier is used to print the integer part of the result.
* The `%f` format specifier is used to print the floating-point part of the result.
* The `float()` method is used to convert the integer result to a floating-point number.

Note: The `raw_input()` function in Python is equivalent to the `Scanner` class in Java. The `map()` function in Python is equivalent to the `split()` method in Java. The `%` operator in Python is equivalent to the `+` operator in Java.</s>
