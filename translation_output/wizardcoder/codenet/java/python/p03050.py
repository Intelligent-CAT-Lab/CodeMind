Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def p03050():
    n = int(input())
    ans = 0
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                ans += m
    print(ans)

if __name__ == '__main__':
    p03050()
```

Explanation:

- We import the `math` module to use the `sqrt()` function.
- We define a function `p03050()` that reads the input `n` from the user, initializes the variable `ans` to 0, and then iterates over all integers `i` from 1 to the square root of `n`.
- For each `i`, we check if `n` is divisible by `i` using the modulo operator `%`. If it is, we calculate the value of `m` as `n // i - 1`, which is the largest integer less than or equal to `n/i` (since `n` is divisible by `i`). We also check if `i` is less than `m`, since we only want to consider pairs of factors that are adjacent in the factorization of `n`. If both conditions are satisfied, we add `m` to `ans`.
- Finally, we print the value of `ans`.<|endoftext|>
