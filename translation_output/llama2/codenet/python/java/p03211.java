<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)
```

### Input

The first line of input contains a string S.

### Output

Print the minimum value of a.

### Constraints

1 <= |S| <= 10^5

### Example Input

```
123456789
```

### Example Output

```
1
```

### Explanation

The minimum value of a is 1.

### Hint

Use the ```min()``` function.
</s>
