<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15 25

Expected output:
113.437508


```
a,b=(int(x) for x in input().split())

if a<=100 and b<=100:
    print(f"{a*b/3.305785:.4f}")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a <= 100 && b <= 100) {
            double result = a * b / 3.305785;
            System.out.println(String.format("%.4f", result));
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `parseInt()` method is used to convert the two parts into integers.
* The `if` statement checks if both `a` and `b` are less than or equal to 100.
* If the condition is true, the calculation is performed and the result is printed with 4 decimal places.

Note: The `f` in the `print()` statement is a format specifier that tells the `printf()` method to print the result with 4 decimal places.</s>
