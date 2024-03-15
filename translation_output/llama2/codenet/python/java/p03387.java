<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
x=max(a,b,c)
y=min(a,b,c)
z=a+b+c-x-y
if (z-y)%2==0:
  print(x-z+(z-y)//2)
else:
  print(x-z+1+(z-y+1)//2)
```

### Input

The first line contains an integer $T$ denoting the number of test cases.

The first line of each test case contains three space-separated integers $a,b,c$ denoting the values of $a,b,c$.

### Output

For each test case, print a single line containing the answer to the problem.

### Constraints

$1 \leq T \leq 100$

$1 \leq a,b,c \leq 10^9$

### Sample Input

```
3
1 2 3
1 2 3
1 2 3
```

### Sample Output

```
1
1
1
```

### Explanation

In the first test case, $x=3, y=1, z=6$.

In the second test case, $x=3, y=1, z=6$.

In the third test case, $x=3, y=1, z=6$.
</s>
