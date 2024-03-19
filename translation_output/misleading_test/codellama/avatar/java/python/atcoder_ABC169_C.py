<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561275

```
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
```
[/INST]
```
import math

a = int(input())
b = float(input())
c = int(math.round(b * 100))
d = a * c
print(d // 100)
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java.</s>
