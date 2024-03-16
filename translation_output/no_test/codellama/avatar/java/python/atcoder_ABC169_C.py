<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long c = (long) Math.round(b * 100);
        long d = a * c;
        System.out.println(d / 100);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import math

a = int(input())
b = float(input())
c = int(math.round(b * 100))
d = a * c
print(d / 100)
```
Note: The `math.round()` function is used to round the value of `b` to the nearest integer, and then it is multiplied by 100 to get the value of `c`. The `d` variable is then calculated by multiplying `a` and `c`, and the final result is printed as a floating-point number with two decimal places.</s>
