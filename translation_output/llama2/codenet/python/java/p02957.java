<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```

### Input

The first line of input contains two integers $A$ and $B$ separated by a space.

### Output

Print the value of $x$ if it is possible, otherwise print "IMPOSSIBLE".

### Constraints

$1 \leq A,B \leq 10^9$

### Sample Input

```
1 2
```

### Sample Output

```
0.5
```

### Explanation

The value of $x$ is $0.5$.

### Hint

Use the `Math` class to calculate the square root of a number.
</s>
