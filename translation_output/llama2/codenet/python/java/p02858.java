<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from fractions import gcd
H,W,T=map(int, input().split())
gh, gw = gcd(H, T), gcd(W, T)
h, w = H // gh, W // gw
MOD = 1000000007
print(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD))
```

### Input

The first line of input contains three integers $H, W, T$ ($1 \leq H, W, T \leq 10^9$).

### Output

Print the output in the format specified in the sample output.

### Constraints

- $1 \leq H, W, T \leq 10^9$

### Sample Input

```
1000000000 1000000000 1000000000
```

### Sample Output

```
1000000000
```

### Explanation

The output is $1000000000$.
</s>
