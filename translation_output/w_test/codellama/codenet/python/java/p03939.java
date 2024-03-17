<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 3

Expected output:
4.500000000000000


```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d += (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.println(ret);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read the input from the user and the `System.out.println()` method to print the output.

The `main()` method takes the input from the user and stores it in the variables `N`, `d`, and `x`. It then initializes the `ret` variable to 0 and starts the loop.

Inside the loop, the code calculates the value of `ret` using the formula you provided. It also updates the values of `d` and `x` using the same formula.

After the loop, the code prints the final value of `ret` using the `System.out.println()` method.

Note that the code assumes that the input is valid and that the user will enter the correct values. If the user enters invalid values, the code may produce incorrect results or throw an exception.</s>
