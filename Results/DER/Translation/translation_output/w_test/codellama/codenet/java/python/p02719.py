<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 4

Expected output:
1


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
```
import math

n, k = map(int, input().split())
ans = min(n % k, k - (n % k))
print(ans)
```
Explanation:

* `map(int, input().split())` is used to convert the input string into a list of integers.
* `min(n % k, k - (n % k))` is used to find the minimum of the two values.
* `print(ans)` is used to print the result.

Note: The `math` module is not required for this solution, but it is used to make the code more readable.</s>
