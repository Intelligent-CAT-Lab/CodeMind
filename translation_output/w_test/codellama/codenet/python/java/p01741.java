<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1.000

Expected output:
2.000000000000


```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double result = n / 1 + 1;
        if (n * Math.pow(2, 0.5) < result) {
            result = n * Math.pow(2, 0.5);
        }
        System.out.println(result);
    }
}
```
This code takes a double value as input and calculates the square root of that value using the `Math.pow(2, 0.5)` method. It then checks if the result is less than the original value divided by 1 plus 1, and if it is, it sets the result to the original value divided by 1 plus 1. Finally, it prints the result.

Note that the `Math.pow(2, 0.5)` method calculates the square root of a number, so the result of this method is the square root of the input value.</s>
