<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,m=map(int,input().split())
ans=[["1"]*(2**m-1) for _ in range(2**n-1)]
for k in range(1,11):
    for i in range(2**k,2**n,2**k):
        for j in range(2**k,2**m,2**k):
            if ans[i-1][j-1]=="1":
                ans[i-1][j-1]="0"
            else:
                ans[i-1][j-1]="1"
for i in range(2**n-1):
    print("".join(ans[i]))
```

### Input

The first line of input contains two integers $n$ and $m$ denoting the number of rows and columns of the matrix respectively.

### Output

Print the output in the same format as the sample output.

### Constraints

$1 \leq n,m \leq 10^5$

### Sample Input

```
4 3
```

### Sample Output

```
0011
0101
1010
1101
```

### Explanation

The first line of input contains two integers $n$ and $m$ denoting the number of rows and columns of the matrix respectively.

### Hint

Use a nested for loop to solve this problem.
</s>
