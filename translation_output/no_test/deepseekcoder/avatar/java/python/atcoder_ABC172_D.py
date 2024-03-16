<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            ans += (long) i * ((long) n / (long) i) * (((long) n / (long) i) + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

### Response:
```python
import sys

def atcoder_ABC172_D():
    n = int(sys.stdin.readline().strip())
    ans = 0
    for i in range(1, n + 1):
        ans += i * (n // i) * ((n // i) + 1) // 2
    print(ans)

atcoder_ABC172_D()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the sum of the products of all pairs of divisors of the number, and prints the result. The calculation is done using the formula for the sum of the first n natural numbers, which is n*(n+1)/2.
<|EOT|>
