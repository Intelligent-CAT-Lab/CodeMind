<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        System.out.println(Math.max(Math.max(Math.max(a * c, b * d), a * d), b * c));
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import math

a, b, c, d = map(int, input().split())

print(max(max(max(a * c, b * d), a * d), b * c))
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to a list of integers, and the `max` function is used to find the maximum value among the four variables. The `math.max` function is not needed in Python, as the `max` function can handle multiple arguments.</s>
