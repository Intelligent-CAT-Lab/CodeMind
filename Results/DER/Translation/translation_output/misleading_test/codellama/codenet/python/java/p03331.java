<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
-85

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
This code reads an integer `N` from the user and calculates the sum of its digits. It then prints the result.

Here's an explanation of the code:

* `import java.util.Scanner;` imports the `Scanner` class, which is used to read input from the user.
* `public class Solution {` declares a class called `Solution`.
* `public static void main(String[] args) {` declares a method called `main`, which is the entry point of the program.
* `Scanner sc = new Scanner(System.in);` creates a new `Scanner` object called `sc` that reads input from the user.
* `int N = sc.nextInt();` reads an integer `N` from the user.
* `int total = 0;` initializes a variable called `total` to 0.
* `int x = N;` initializes a variable called `x` to `N`.
* `while (x > 0) {` starts a loop that runs while `x` is greater than 0.
* `total += x % 10;` adds the last digit of `x` to `total`.
* `x = x / 10;` divides `x` by 10 to get the next digit.
* `}` ends the loop.
* `System.out.println(total);` prints the result.

Note that this code is similar to the Python code, but it uses Java syntax and data types.</s>
