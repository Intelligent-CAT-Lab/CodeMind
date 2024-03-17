

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

* 1≤N≤100
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
3
abc
```

### Sample Output 1

```
acb
```

### Sample Input 2

```
5
atcoder
```

### Sample Output 2

```
atcoder
```

### Sample Input 3

```
10
codeforces
```

### Sample Output 3

```
codeforces
```

### Note

In the first sample, we can obtain "acb" by choosing l=1 and r=3.

In the second sample, we cannot perform the operation.

In the third sample, we cannot perform the operation.

### Solution

```python
n = int(input())
s = input()

if n % 2 == 0:
    print(s)
else:
    print(s[0] + s[2:][::-1] + s[1])
```

## D - Takahashi's Information

### Problem

Takahashi has a string S of length N consisting of lowercase English letters.

He will perform the following operation exactly once:

Choose two integers l and r (1≤l<r≤N) and replace the substring S[l...r] with the reverse of S[l...r]. Here, S[l...r] denotes the substring of S that starts at the l-th character from the beginning of S and ends at the r-th character from the beginning of S, inclusive.

Find the lexicographically smallest string that can be obtained by performing the operation once.

### Constraints

* 1≤N≤100
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
3
abc
```

### Sample Output 1

```
acb
```

### Sample Input 2

```
5
atcoder
```

### Sample Output 2

```
atcoder
```

### Sample Input 3

```
10
codeforces
```

### Sample Output 3

```
codeforces
```

### Note

In the first sample, we can obtain "acb" by choosing l=1 and r=3.

In the second sample, we cannot perform the operation.

In the third sample, we cannot perform the operation.

### Solution

```python
n = int(input())
s = input()

if n % 2 == 0:
    print(s)
else:
    print(s[0] + s[2:][::-1] + s[1])
```
/atcoder/abc178/abc178_c.py
n = int(input())

mod = 10 ** 9 + 7

ans = pow(10, n, mod) - 2 * pow(9, n, mod) - 2 * pow(8, n, mod) + pow(7, n, mod)
print(ans % mod)
/atcoder/abc178/abc178_b.py
a, b, c, d = map(int, input().split())
print(max(a * c, b * d, a * d, b * c))
/atcoder/abc178/abc178_d.p 10 ** 9 + 7

ans = 0
for i in range(3, n + 1):
    ans += dp[i]

print(ans % mod)
y
n = int(input())

dp = [0] * (n + 1)
dp[0] = 1

for i in range(n + 1):
    for j in range(3, n + 1):
        if i + j > n:
            break
        dp[i + j] += dp[i]

# print(dp)

mod =
