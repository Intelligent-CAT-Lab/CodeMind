<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split());p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[-2]*pow(f[i]*f[-2-i],-1,p)for i in r(n-1,k))%p)
```

### Input

The first line contains two integers, $n$ and $k$.

### Output

Print the answer modulo $p$.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq k \leq 10^5$

$1 \leq p \leq 10^9$

### Sample Input

```
4 2
```

### Sample Output

```
1
```

### Explanation

The first line contains two integers, $n$ and $k$.

### Hint

Use the formula for the sum of a geometric series.

### Source

[The USACO 2019 November Platinum](https://open.kattis.com/problems/usaco19novplatinum)</s>
