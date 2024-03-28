<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000

Expected output:
3


```
n = int(input())

result = []
for i in range(1, int(n**(1/2)+1)):
    if n%i==0:
        result.append(max(len(str(i)), len(str(n//i))))
print(min(result))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = Math.max(result, Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        System.out.println(result);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first prompts the user to enter a number, and then it uses a for loop to iterate from 1 to the square root of the number. For each iteration, it checks if the number is divisible by the current value of i, and if it is, it calculates the maximum length of the string representation of the divisors and adds it to the result. Finally, it prints the result.

Note that the `Math.sqrt()` method is used to calculate the square root of the number, and the `Math.max()` method is used to calculate the maximum of two numbers. The `String.valueOf()` method is used to convert a number to a string, and the `length()` method is used to get the length of the string.</s>
