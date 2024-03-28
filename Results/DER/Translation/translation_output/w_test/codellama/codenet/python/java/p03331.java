<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
6


```

import sys
def input():
	return sys.stdin.readline().strip()

N = int(input())

def sum_N(N):
	total = 0
	x = N
	while x > 0:
		total += x % 10
		x = x // 10
	return total

ans = 1000000000000
for i in range(1, N):
	ans = min(ans, sum_N(i) + sum_N(N - i))

print(ans)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        int x = N;
        while (x > 0) {
            total += x % 10;
            x = x / 10;
        }
        System.out.println(total);
    }
}
```
This code reads an integer `N` from standard input using the `Scanner` class, and then calculates the sum of the digits of `N` using a while loop. The sum is stored in the variable `total`, and then printed to the console using `System.out.println()`.

Note that the `Scanner` class is used to read input from the console, and the `nextInt()` method is used to read an integer value from the input. The `nextInt()` method returns an integer value, which is then stored in the variable `N`.

Also, note that the `while` loop is used to calculate the sum of the digits of `N`. The loop continues until `x` is greater than 0, and at each iteration, the loop calculates the sum of the digits of `x` and adds it to the total. The loop then updates `x` to be `x / 10`, which is the integer division of `x` by 10.

Finally, the `System.out.println()` method is used to print the value of `total` to the console.</s>
