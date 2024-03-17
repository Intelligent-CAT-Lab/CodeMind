<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
6


```
n, m = map(int, input().split())
print((n-1)*(m-1))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `n` and `m`. It then calculates the product of `n-1` and `m-1` and prints the result to the console using the `println()` method.

Note that in Java, the `nextInt()` method returns an `int` value, so you don't need to explicitly cast the result to an `int` like you do in Python.</s>
