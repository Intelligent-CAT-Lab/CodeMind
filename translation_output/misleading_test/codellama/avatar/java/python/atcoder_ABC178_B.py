<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
418379342 802780784 -790013317 -445130206

Expected output:
-186233282690604537

```
import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        System.out.println(Math.max(Math.max(Math.max(a * c, b * d), a * d), b * c));
    }
}
```
[/INST]
```python
import math

def max_product(a, b, c, d):
    return max(a * c, b * d, a * d, b * c)

a, b, c, d = map(int, input().split())
print(max_product(a, b, c, d))
```
This code uses the `math.max()` function to find the maximum of four numbers. It first splits the input into four integers using the `split()` method, and then uses the `max_product()` function to find the maximum product of any two of the four numbers. Finally, it prints the result.</s>
