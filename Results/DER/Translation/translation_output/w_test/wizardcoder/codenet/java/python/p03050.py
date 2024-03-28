Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
10


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class p03050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long ans = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
           if(n % i == 0) {
               long m = n / i - 1;
               if(i < m) ans += m;
           }
        }

        System.out.println(ans);
        
        br.close();
    }
}
```

### Response:
```python
import math

def count_pairs(n):
    count = 0
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                count += m
    return count

n = int(input())
print(count_pairs(n))
```

Explanation:

We can use the same logic as the given java code to count the number of pairs of integers that sum up to a given number n. We can iterate over all the integers from 1 to the square root of n and check if n is divisible by i. If it is, then we can calculate the value of m as n/i - 1 and check if i is less than m. If it is, then we can add m to the count. Finally, we return the count.<|endoftext|>
