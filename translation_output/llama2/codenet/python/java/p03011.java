<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```

### Input

The first line of input contains an integer $T$ denoting the number of test cases.

The first line of each test case contains three space-separated integers $a,b,c$ denoting the values of $a,b,c$ respectively.

### Output

For each test case, print a single line containing the value of $a+b+c-max(a,b,c)$.

### Constraints

$1 \leq T \leq 100$

$1 \leq a,b,c \leq 10^9$

### Sample Input

```
3
1 2 3
2 3 4
1 2 3
```

### Sample Output

```
4
5
2
```

### Explanation

```
a+b+c-max(a,b,c) = 1+2+3-3 = 4
a+b+c-max(a,b,c) = 2+3+4-4 = 5
a+b+c-max(a,b,c) = 1+2+3-3 = 2
```
</s>
