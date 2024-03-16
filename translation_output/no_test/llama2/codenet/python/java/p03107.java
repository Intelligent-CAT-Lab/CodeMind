<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```

### Input

- The first line contains an integer `N` denoting the number of test cases.
- The next `N` lines contain a string `A` of length at most `10^5`.

### Output

- For each test case, print a single line containing an integer denoting the minimum number of 0s and 1s required to represent the string `A`.

### Constraints

- `1 <= N <= 10^5`
- `1 <= |A| <= 10^5`
- `A` consists of only the characters `0` and `1`.

### Example

```
Input:
3
001
111
010

Output:
2
2
1
```

### Explanation

- The string `001` can be represented by `00` and `1`.
- The string `111` can be represented by `11` and `1`.
- The string `010` can be represented by `01` and `1`.

### Hint

- Use the `count` method of the `list` class to find the number of occurrences of each character in the string.
- Use the `min` function to find the minimum number of 0s and 1s required to represent the string.
</s>
