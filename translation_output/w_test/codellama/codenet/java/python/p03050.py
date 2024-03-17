<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import math

def solve(n):
    ans = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                ans += m
    return ans

n = int(input())
print(solve(n))
```
This code uses the same approach as the Java code, but it is written in Python. It first reads the input from the user, then it calculates the sum of the divisors of the input number using the same logic as the Java code. Finally, it prints the result.

Note that the `math.sqrt()` function is used to calculate the square root of the input number, and the `int()` function is used to convert the result to an integer.</s>
