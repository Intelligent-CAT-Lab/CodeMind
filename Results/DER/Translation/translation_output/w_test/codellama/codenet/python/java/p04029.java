<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
n = int(input())
print(int((n + 1) * n / 2)) 
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(n * (n + 1) / 2);
    }
}
```
This code takes an integer `n` as input and prints the sum of the first `n` positive integers.

The formula for the sum of the first `n` positive integers is given by `n * (n + 1) / 2`. This formula can be derived by considering the area of a right triangle with legs of length `n` and `n + 1`. The sum of the first `n` positive integers is equal to the area of this triangle.

In Java, we can use the `parseInt()` method to convert the input string to an integer, and then use the formula to calculate the sum. Finally, we print the result using `System.out.println()`.

Here's an example of how to run this code:
```
$ java Main 3
6
```
This code takes the integer `3` as input, calculates the sum of the first 3 positive integers, which is `6`, and prints the result to the console.</s>
