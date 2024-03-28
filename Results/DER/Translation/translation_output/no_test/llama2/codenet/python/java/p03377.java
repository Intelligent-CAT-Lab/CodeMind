<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')
```

### Input

The first line of input contains an integer $T$ denoting the number of test cases.

The first line of each test case contains three space-separated integers $a,b,x$ denoting the values of $a,b,x$ respectively.

### Output

For each test case, print 'YES' if $a\leq x$ and $a+b\geq x$ else 'NO'.

### Constraints

$1\leq T\leq 10^5$

$1\leq a,b,x\leq 10^9$

### Sample Input

```
3
1 2 3
2 3 4
3 4 5
```

### Sample Output

```
YES
NO
YES
```

### Explanation

In the first test case, $a=1,b=2,x=3$ and $a\leq x$ and $a+b\geq x$ so the output is 'YES'.

In the second test case, $a=2,b=3,x=4$ and $a\leq x$ but $a+b\leq x$ so the output is 'NO'.

In the third test case, $a=3,b=4,x=5$ and $a\leq x$ and $a+b\geq x$ so the output is 'YES'.
</s>
