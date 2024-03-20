
```python
a, b, c, d = map(int, input().split())
print(max(a * c, b * d, a * d, b * c))
```

## C - Ubiquity

### Problem

Takahashi has a string S of length N consisting of lowercase English letters.

He will perform the following operation exactly once:

Choose two integers l and r (1≤l<r≤N) and replace the substring S[l...r] with the reverse of S[l...r]. Here, S[l...r] denotes the substring of S that starts at the l-th character from the beginning of S and ends at the r-th character from the beginning of S, inclusive.

Find the lexicographically smallest string that can be obtained by performing the operation once.

### Constraints

* 2≤N≤100
* S consists of lowercase English letters.

### Input

Input is given from Standard Input in the following format:

```
N
S
```

### Output

Print the lexicographically smallest string that can be obtained by performing the operation once.

### Sample Input 1

```
4
abcd
```

### Sample Output 1

```
abdc
```

### Sample Input 2

```
6
codeforces
```

### Sample Output 2

```
codeforces
```

### Sample Input 3

```
10
atcoderabc
```

### Sample Output 3

```
atcodercba
```

### Note

In the first sample, we can obtain the string "abdc" by replacing the substring "cd" with the reverse of "cd".

In the second sample, the string is already lexicographically smallest.

In the third sample, we can obtain the string "atcodercba" by replacing the substring "abc" with the reverse of "abc".

### Solution

```python
n = int(input())
s = input()

print(s[:n//2] + s[n//2:][::-1])
```

## D - Takahashi's Information

### Problem

Takahashi has a string S of length N consisting of lowercase English letters.

He will perform the following operation exactly once:

Choose two integers l and r (1≤l<r≤N) and replace the substring S[l...r] with the reverse of S[l...r]. Here, S[l...r] denotes the substring of S that starts at the l-th character from the beginning of S and ends at the r-th character from the beginning of S, inclusive.

Find the lexicographically smallest string that can be obtained by performing the operation once.

### Constraints

* 2≤N≤100
* S consists of lowercase English letters.

### Input

Input is given from Standard Input in the following format:

```
N
S
```

### Output

Print the lexicographically smallest string that can be obtained by performing the operation once.

### Sample Input 1

```
4
abcd
```

### Sample Output 1

```
abdc
```

### Sample Input 2

```
6
codeforces
```

### Sample Output 2

```
codeforces
```

### Sample Input 3

```
10
atcoderabc
```

### Sample Output 3

```
atcodercba
```

### Note

In the first sample, we can obtain the string "abdc" by replacing the substring "cd" with the reverse of "cd".

In the second sample, the string is already lexicographically smallest.

In the third sample, we can obtain the string "atcodercba" by replacing the substring "abc" with the reverse of "abc".

### Solution

```python
n = int(input())
s = input()

print(s[:n//2] + s[n//2:][::-1])
```
/atcoder/ABC178/ABC178_C.py
n = int(input())

mod = 10 ** 9 + 7

ans = pow(10, n, mod) - 2 * pow(9, n, mod) - 2 * pow(8, n, mod) + pow(7, n, mod)

print(ans % mod)
/atcoder/ABC178/ABC178_D.py
s = int(input())

mod = 10 ** 9 + 7

dp = [0] * (s + 1)

dp[0] = 1

for i in range(3, s + 1):
    dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % mod

print(dp[s])
/atcoder/ABC178/ABC178_A.py
x = int(input())

print(1 - x)


print(ans)
/atcoder/ABC178/ABC178_B.py
a, b, c, d = map(int, input().split())

ans = max(a * c, b * d, a * d, b * c)
