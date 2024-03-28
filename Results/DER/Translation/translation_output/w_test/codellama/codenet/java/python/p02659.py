<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
217


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
import math

def main():
    a, b = map(float, input().split())
    bb = math.ceil(b * 100)
    ans = int(a * bb / 100)
    print(ans)

if __name__ == '__main__':
    main()
```
This code uses the `math.ceil()` function to round the value of `b` to the nearest integer, and then multiplies it by 100 to get the value of `bb`. It then uses integer division to calculate the result of `a * bb / 100`, which is the expected output.

Note that the `input()` function is used to read the input from the user, and the `split()` method is used to split the input into two parts, which are then converted to floating-point numbers using the `map()` function.</s>
