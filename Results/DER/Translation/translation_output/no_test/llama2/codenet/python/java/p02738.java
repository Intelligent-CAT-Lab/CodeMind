<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```

### Input

The first line contains two integers `n` and `M` separated by a space.

### Output

Print the sum of the last row of the matrix `d` modulo `M`.

### Constraints

`1 <= n <= 10^5`

`1 <= M <= 10^9`

### Sample Input

```
4 1000000007
```

### Sample Output

```
1000000000
```

### Explanation

The first line of the input contains two integers `n` and `M` separated by a space.

The first line of the output contains the sum of the last row of the matrix `d` modulo `M`.

### Hint

Use the `BigInteger` class to represent the numbers.
</s>
