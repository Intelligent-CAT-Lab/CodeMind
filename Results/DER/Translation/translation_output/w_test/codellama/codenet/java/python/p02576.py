<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
12


```
import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}
```
[/INST]
```
import sys

n, x, t = map(int, sys.stdin.readline().split())
ans = 0
tako = 0
while n > tako:
    ans += t
    tako += x
print(ans)
```
This code reads the input from stdin, splits it into three integers using the `split()` method, and then uses a `while` loop to calculate the sum of the first `n` multiples of `t` that are less than or equal to `x`. The `tako` variable is used to keep track of the current multiple of `x`, and the `ans` variable is used to store the sum of the multiples. The final result is printed to stdout.</s>
