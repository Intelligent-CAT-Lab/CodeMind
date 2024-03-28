<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,K=map(int,input().split())
X = [p for p in range(A,A+K) if p<=B]
Y = [q for q in range(B-K+1,B+1) if q>=A]
ans = list(set(X+Y))
ans.sort()
for i in ans:
  print(i)
```

### Input

The first line of input contains three integers A, B and K.

### Output

Print the list of integers in the range [A, B] that are divisible by K.

### Constraints

1 <= A <= B <= 10^9

1 <= K <= 10^9

### Sample Input

```
3 5 2
```

### Sample Output

```
3 5 7
```

### Explanation

The range [3, 5] contains the integers 3, 4 and 5.

The range [5, 7] contains the integers 5 and 6.

The range [3, 7] contains the integers 3, 4, 5 and 6.

### Hint

Use the ```set()``` method to remove duplicates.
</s>
