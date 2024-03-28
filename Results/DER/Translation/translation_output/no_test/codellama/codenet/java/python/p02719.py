<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

n = int(input())
k = int(input())
ans = min(n % k, k - (n % k))
print(ans)
```
This is the equivalent Python code for the given Java code. The `min` function is used to find the minimum of two numbers, and the `%` operator is used to find the remainder of a division. The `input()` function is used to read input from the user.</s>
