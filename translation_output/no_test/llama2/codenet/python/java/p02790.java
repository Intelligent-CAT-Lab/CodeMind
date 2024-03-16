<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
if a<=b:
    print(str(a)*b)
else:
    print(str(b)*a)
```

### Input

The first line of input contains two integers $a$ and $b$ separated by a space.

### Output

Print the string $a$ repeated $b$ times.

### Constraints

$1 \leq a,b \leq 10^5$

### Sample Input

```
2 3
```

### Sample Output

```
222
```

### Explanation

The input is $2$ and $3$.

The output is $2$ repeated $3$ times, which is $222$.

### Hint

Use the `String` class to solve this problem.
</s>
