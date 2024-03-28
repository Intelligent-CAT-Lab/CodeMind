<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-42

```
import java.util.Scanner;

public class p03419 {

    private Scanner in = new Scanner(System.in);

    void solve() {
        long n = in.nextLong(), m = in.nextLong();
        if(n == 2 || m == 2) {
            System.out.println(0);
            return;
        }
        long ans = Math.max(1, n - 2) * Math.max(1, m - 2);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new p03419().solve();
    }
}
```
[/INST]
```python
import math

def solve():
    n, m = map(int, input().split())
    if n == 2 or m == 2:
        print(0)
        return
    ans = max(1, n - 2) * max(1, m - 2)
    print(ans)

solve()
```
This code uses the `math.max()` function to find the maximum of two numbers, and the `input()` function to read a line of input from the user. The `split()` method is used to split the input into two numbers, and the `map()` function is used to convert the numbers to integers. The `print()` function is used to output the result.</s>
