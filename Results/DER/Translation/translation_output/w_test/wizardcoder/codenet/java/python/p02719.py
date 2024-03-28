Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

n, k = map(int, input().split())

ans = min(n%k, k-n%k)

print(ans)
```

Explanation:

In Python, we can use the `math` module to get the minimum value of two numbers. We can use the `min()` function to get the minimum value of `n%k` and `k-(n%k)`. Finally, we can print the value of `ans`.<|endoftext|>
