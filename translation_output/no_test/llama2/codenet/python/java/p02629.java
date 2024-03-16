<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys 
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N = int(readline())
res = ''
while(N):
    N -= 1
    res += chr(ord('a') + N % 26)
    N //= 26
print(res[::-1])
```

### Input

- The first line contains a single integer `N` denoting the number of test cases.
- The next `N` lines contain a single integer each denoting the number of characters in the string.
- The next `N` lines contain a string each.

### Output

- For each test case, print the string in the same order as the input.

### Constraints

- `1 <= N <= 100000`
- `1 <= length of string <= 100000`
- The string consists of only lowercase English letters.

### Example

```
Input:
3
10
abcdefghij
10
abcdefghij
10
abcdefghij

Output:
abcdefghij
abcdefghij
abcdefghij
```

### Explanation

- The first test case is the same as the example.
- The second test case is the same as the example.
- The third test case is the same as the example.

### Hint

- Use the `BufferedReader` class to read the input.
- Use the `StringBuilder` class to build the output.
</s>
