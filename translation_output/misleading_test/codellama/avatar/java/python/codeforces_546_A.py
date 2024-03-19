<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 1000000000 1000

Expected output:
-60

```
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o, g, x = 0;
        long n, borrow = 0;

        o = sc.nextInt();
        n = sc.nextLong();
        g = sc.nextInt();

        for (int i = 1; i <= g; i++) {
            x = x + i * o;
        }

        borrow = x - n;

        if (borrow <= 0)
            System.out.println(0);
        else
            System.out.println(borrow);
    }
}
```
[/INST]
```python
import sys

o, n, g = map(int, sys.stdin.readline().split())
x = 0

for i in range(1, g+1):
    x += i * o

borrow = x - n

if borrow <= 0:
    print(0)
else:
    print(borrow)
```
Explanation:

* `map(int, sys.stdin.readline().split())` is used to read the input from the standard input and convert it to integers.
* `x = 0` is used to initialize the variable `x` to 0.
* `for i in range(1, g+1):` is used to iterate from 1 to `g` and calculate the sum of `i * o` for each iteration.
* `x += i * o` is used to add the current value of `i * o` to the previous value of `x`.
* `borrow = x - n` is used to calculate the borrow.
* `if borrow <= 0:` is used to check if the borrow is less than or equal to 0.
* `print(0)` is used to print 0 if the borrow is less than or equal to 0.
* `else:` is used to execute the code if the borrow is greater than 0.
* `print(borrow)` is used to print the borrow.</s>
