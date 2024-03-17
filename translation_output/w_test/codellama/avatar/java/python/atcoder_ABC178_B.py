<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
418379342 802780784 -790013317 -445130206

Expected output:
-186233282690604452


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
```
import math

a, b, c, d = map(int, input().split())

print(max(max(max(a * c, b * d), a * d), b * c))
```
This code uses the `math.max()` function to find the maximum of the four numbers, which are the product of the two pairs of numbers. The `map()` function is used to convert the input strings to integers.</s>
