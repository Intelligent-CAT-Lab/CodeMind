<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()

n = len(s)-1
ans = 0
for i in range(len(s)//2):
	if s[i] != s[n-i]:
		ans += 1

print(ans)
```

### Input

- The first line contains a string `s`

### Output

- Print the number of pairs of indices `i` and `j` such that `s[i] != s[j]`

### Constraints

- `1 <= len(s) <= 10^5`
- `s` contains only lowercase English letters

### Example Input

```
abcdef
```

### Example Output

```
0
```

### Explanation

- There are no pairs of indices `i` and `j` such that `s[i] != s[j]`

### Hint

- Use the `len()` function to get the length of the string
- Use the `range()` function to iterate over the indices of the string
- Use the `!=` operator to check if two strings are not equal
- Use the `+=` operator to add two numbers
</s>
