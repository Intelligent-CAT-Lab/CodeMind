<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
288

```
import java.util.*;

public class p02659 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    long bb = (long)((double)100 * b + 0.1);
    long ans = (a * bb) / (long)100;
    System.out.println(ans);
  }
}
```
[/INST]
```
import sys

a, b = map(float, sys.stdin.readline().split())
bb = int(100 * b + 0.1)
ans = int(a * bb / 100)
print(ans)
```
This code uses the `map` function to convert the input strings to floats, and then uses the `int` function to convert the result to an integer. The `bb` variable is calculated by multiplying `b` by 100 and adding 0.1, which is then converted to an integer using the `int` function. Finally, the `ans` variable is calculated by dividing `a` by `bb` and then multiplying the result by 100, which is then rounded to an integer using the `int` function. The `print` function is used to output the result.</s>
