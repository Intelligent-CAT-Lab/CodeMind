<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 5

Expected output:
5


```
# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N != 100 else 100 ** D * (N + 1))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(100 * D * N);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the values of `D` and `N`. It then calculates the result using the formula `100 * D * N`, and prints it to the console using the `println()` method.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read the values of `D` and `N`. The `println()` method is used to print the result to the console.</s>
