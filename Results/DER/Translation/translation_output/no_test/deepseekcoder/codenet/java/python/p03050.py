<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys
import math

def main():
    n = int(sys.stdin.readline())
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

This Python code does the same thing as the Java code. It reads a number from the standard input, calculates the sum of all divisors of that number, and prints the result. The only difference is that Python uses `//` for integer division and `math.isqrt(n)` to get the integer square root of `n`.
<|EOT|>
