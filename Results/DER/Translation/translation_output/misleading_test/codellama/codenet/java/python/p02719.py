<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 4

Expected output:
-86

```
import java.util.*;
import java.io.*;
import java.math.*;
 
public class p02719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = Math.min(n%k, k-(n%k));
        System.out.println(ans);
    }

}
```
[/INST]
```python
import math

n = int(input())
k = int(input())
ans = min(n%k, k-(n%k))
print(ans)
```
Explanation:

* `math.min()` is used to find the minimum of two numbers.
* `n%k` is used to find the remainder of `n` divided by `k`.
* `k-(n%k)` is used to find the difference between `k` and the remainder of `n` divided by `k`.
* `min()` is used to find the minimum of the two values.
* `print()` is used to print the result.</s>
