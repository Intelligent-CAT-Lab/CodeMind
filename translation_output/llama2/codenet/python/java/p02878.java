<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B=map(int,input().split());M=998244353;P=N+1;f=1;F=[1]*P;I=[1]*P;z=0;R=range
for n in R(1,P):F[n]=f=f*n%M
I[N]=i=pow(f,M-2,M)
for n in R(N,1,-1):I[n-1]=i=i*n%M
for k in R(min(A+1,N-B)if N-B-A else A+1):Q=N-B-k-1;z+=(B-k)*F[B+k-1]*I[B]*I[k]*F[Q+A-k]*I[Q]*I[A-k]
print(z%M if B else 1)
```

### Input

The first line contains three integers $N,A,B$ ($1 \leq N \leq 10^5, 0 \leq A,B \leq N-1$).

### Output

Print the answer modulo $10^9+7$.

### Constraints

- $1 \leq N,A,B \leq 10^5$

### Sample Input

```
4 1 2
```

### Sample Output

```
1
```

### Explanation

```
N=4,A=1,B=2

F=[1,2,4,8]
I=[1,1,1,1]

z=0

for n in range(1,4):
    F[n]=f=f*n%998244353

for n in range(4,1,-1):
    I[n-1]=i=pow(f,998244353-2,998244353)

for k in range(min(1+A,4-B)):
    Q=4-B-k-1
    z+=B-k*F[B+k-1]*I[B]*I[k]*F[Q+A-k]*I[Q]*I[A-k]

print(z%998244353+7)
```
</s>
