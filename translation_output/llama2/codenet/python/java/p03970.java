<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S = str(input())
A = 'CODEFESTIVAL2016'
cnt = 0
for i in range(len(A)):
    if A[i] != S[i]:
        cnt += 1
print(cnt)
```

### Input

The first line contains a string S.

### Output

Print the number of characters that are different in the two strings.

### Constraints

1 <= |S| <= 100000

1 <= |A| <= 100000

### Sample Input

```
CODEFESTIVAL2016
```

### Sample Output

```
1
```

### Explanation

The first character is different.
</s>
