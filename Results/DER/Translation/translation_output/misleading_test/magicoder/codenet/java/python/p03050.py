<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
38

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

@@ Response
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

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the sum of all numbers less than the input number that divide evenly into it, and then prints the result. The `math.isqrt(n)` function is used instead of `Math.sqrt(n)` to get the integer square root of `n`.<｜end▁of▁sentence｜>
