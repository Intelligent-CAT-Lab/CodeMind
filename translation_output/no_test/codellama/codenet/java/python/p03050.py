<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

def get_sum_of_divisors(n):
    sum = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                sum += m
    return sum

n = int(input())
print(get_sum_of_divisors(n))
```
This is a Python implementation of the Java code you provided. It uses the `math` module to calculate the square root of `n`, and then iterates through the range of numbers from 1 to the square root of `n` to find the sum of the divisors of `n`. The `if` statement checks if `n` is divisible by `i`, and if it is, it calculates the value of `m` and adds it to the sum if `i` is less than `m`. Finally, it prints the sum of the divisors of `n`.</s>
