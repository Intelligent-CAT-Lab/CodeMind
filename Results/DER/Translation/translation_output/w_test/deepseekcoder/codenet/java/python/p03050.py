<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

def main():
    n = int(input())
    ans = 0
    for i in range(1, math.isqrt(n) + 1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                ans += m
    print(ans)

if __name__ == "__main__":
    main()
```

In the Python code, we use the `math.isqrt(n)` function to get the integer square root of `n`. This is equivalent to `int(math.sqrt(n))` in Java. The `//` operator in Python is used for integer division, which is equivalent to `/` in Java. The `range` function in Python is equivalent to the `for` loop in Java. The `if __name__ == "__main__":` line is used to call the `main` function when the script is run directly.
<|EOT|>
