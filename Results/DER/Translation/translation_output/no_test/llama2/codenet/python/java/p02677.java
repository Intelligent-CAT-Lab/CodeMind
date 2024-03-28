<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,H,M = list(map(int,input().split()))

import math

l = H*360/12 + M*30/60
s = M*360/60
ang = abs(l-s)
c = A**2 + B**2 -2*B*A*math.cos(math.radians(ang))
print(math.sqrt(c))
```

### Input

The first line contains 4 integers A,B,H,M.

### Output

Print the square root of the given expression.

### Constraints

1 <= A,B <= 100

1 <= H,M <= 100

### Sample Input

```
10 10 10 10
```

### Sample Output

```
10
```

### Explanation

The given expression is `A**2 + B**2 -2*B*A*math.cos(math.radians(ang))`.

### Hint

Use the `import` statement to import the required functions.
</s>
