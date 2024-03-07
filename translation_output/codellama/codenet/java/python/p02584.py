<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


import java.util.Scanner;

public class p02584 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = Long.parseLong(scan.next());
        long k = Long.parseLong(scan.next());
        long d = Long.parseLong(scan.next());
        scan.close();

        long ans = 0;
        long absX = Math.abs(x);
        if (absX / d >= k) {
            ans = absX - k * d;
        } else {
            long sho = absX / d;
            long amari = absX % d;
            if ((k - sho) % 2 == 0) {
                ans = amari;
            } else {
                ans = d - amari;
            }
        }

        System.out.println(ans);
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import math

x = int(input())
k = int(input())
d = int(input())

ans = 0
abs_x = abs(x)
if abs_x // d >= k:
    ans = abs_x - k * d
else:
    sho = abs_x // d
    amari = abs_x % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```
Note: In Python, the `//` operator is used for integer division, which returns the integer part of the result. The `%` operator is used for modulo division, which returns the remainder of the result.</s>
