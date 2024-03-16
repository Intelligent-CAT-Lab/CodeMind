
```
import math

r, c = map(int, input().split())
a, b = map(int, input().split())
mod = 10**9 + 7
fact = [1] * (r + c)
ifact = [1] * (r + c)
for i in range(1, r + c):
    fact[i] = fact[i - 1] * i % mod
    ifact[i] = ifact[i - 1] * pow(i, mod - 2, mod) % mod
res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod
sub = 0
for x in range(b):
    v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod
    v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod
    sub = (sub + v1 * v2 % mod) % mod
res = (res - sub + mod) % mod
print(res)
```

## Problem D

### Problem

You are given a string $s$ of length $n$ consisting of lowercase English letters.

You have to find the number of substrings of $s$ that are palindromes.

A string is a palindrome if it reads the same from left to right and from right to left.

### Input

The first line contains a single integer $n$ ($1 \le n \le 2 \cdot 10^5$) — the length of $s$.

The second line contains a string $s$ of length $n$ consisting of lowercase English letters.

### Output

Print a single integer — the number of substrings of $s$ that are palindromes.

### Examples

input
```
5
abcba
```
output
```
11
```
input
```
7
abacaba
```
output
```
21
```

### Note

In the first example, all substrings of length $1$ are palindromes, and there is only one substring of length $2$ that is a palindrome.

In the second example, the palindromes are: "a", "b", "c", "a", "b", "a", "c", "a", "b", "a", "c", "a", "b", "a", "c", "a", "b", "a", "c", "a", "b".

### Solution

The solution is to count the number of palindromes of length $1$ to $n$.

For each length $i$, we can count the number of palindromes of length $i$ by counting the number of palindromes of length $i$ that start at each position.

For each position $i$, we can count the number of palindromes of length $i$ that start at $i$ by counting the number of palindromes of length $i$ that start at $i$ and end at each position $j$.

For each position $j$, we can count the number of palindromes of length $i$ that start at $i$ and end at $j$ by counting the number of palindromes of length $i$ that start at $i$ and end at $j$ and have the same character at position $i$ and position $j$.

For each position $j$, we can count the number of palindromes of length $i$ that start at $i$ and end at $j$ and have the same character at position $i$ and position $j$ by counting the number of palindromes of length $i - 2$ that start at $i + 1$ and end at $j - 1$.

For each position $j$, we can count the number of palindromes of length $i - 2$ that start at $i + 1$ and end at $j - 1$ by counting the number of palindromes of length $i - 2$ that start at $i + 1$ and end at each position $k$.

For each position
