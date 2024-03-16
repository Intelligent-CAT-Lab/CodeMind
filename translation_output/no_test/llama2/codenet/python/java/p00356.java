<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```

### Input

The first line contains two integers `a` and `b` separated by a space.

### Output

Print the sum of `a` and `b` minus the greatest common divisor of `a` and `b` plus `1`.

### Constraints

1 <= `a`, `b` <= 1000000

### Hint

Use the `gcd` function from the `math` module.

### Example

```
Input:
2 3

Output:
5
```
</s>
