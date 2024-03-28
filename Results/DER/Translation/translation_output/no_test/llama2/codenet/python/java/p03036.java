<s> Translate the following python code to java and enclose your solution inside ```java```:
```
r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)
```

### Input

The first line of input contains three integers $r,d,x$ ($1 \leq r,d,x \leq 10^9$).

### Output

Print the value of $x$ after $10$ iterations.

### Constraints

- $1 \leq r,d,x \leq 10^9$

### Sample Input

```
3 2 1
```

### Sample Output

```
-1
```

### Explanation

```
r = 3
d = 2
x = 1

x = 3*x-2
x = 3*x-2
x = 3*x-2
x = 3*x-2
x = 3*x-2
x = 3*x-2
x = 3*x-2
x = 3*x-2
x = 3*x-2
x = 3*x-2
x = -1
```
</s>
