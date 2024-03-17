

```python
n = int(input())
if (n & (n - 1)) == 0:
    print("YES")
else:
    print("NO")
```

## 2. 1005A - Tanya and Stairways

Tanya is very excited about the upcoming programming contest, so she decided to play with numbers. She took a sequence of n integers a1, a2, ..., an and started to play with it.

First, she wrote down all the integers from 1 to n on a piece of paper. Then she started to erase some of the numbers. The girl erased the number i if and only if ai = 0. After that she wrote down all the remaining numbers in the order in which they appeared on the paper.

For example, if n = 6 and a = [1, 0, 2, 0, 3, 0], then Tanya wrote down the numbers [1, 2, 3, 6].

Your task is to find out which numbers Tanya wrote down.

Input
The first line of the input contains a single integer n (1 ≤ n ≤ 100) — the number of integers in the sequence.

The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100) — the sequence of integers.

Output
In the first line print a single integer k — the number of remaining numbers.

In the second line print k integers — the numbers that Tanya wrote down in the order in which they appeared in the sequence.

Sample test(s)
input
6
1 0 2 0 3 0
output
3
1 2 3
input
5
1 2 3 4 5
output
5
1 2 3 4 5
input
5
1 0 0 0 0
output
1
1

```python
n = int(input())
a = list(map(int, input().split()))

ans = []
for i in range(n):
    if a[i] != 0:
        ans.append(i + 1)

print(len(ans))
print(*ans)
```

## 3. 1005B - Delete from the Left

You are given two strings s and t. You can delete some (possibly, none or all) characters from the beginning of s and some (possibly, none or all) characters from the beginning of t so that the strings become equal.

For example, if s = "abacaba" and t = "ac", then you can delete the first character from s and the second character from t so that the strings become equal.

What is the minimum number of characters you have to delete from the beginning of the strings so that the strings become equal?

Input
The first line contains a non-empty string s consisting of lowercase Latin letters. The length of s is no more than 100.

The second line contains a non-empty string t consisting of lowercase Latin letters. The length of t is no more than 100.

Output
Print a single integer — the minimum number of characters you have to delete from the beginning of the strings so that the strings become equal.

Sample test(s)
input
abacaba
ac
output
2
input
a
aa
output
1
input
ababa
baba
output
0

```python
s = input()
t = input()

ans = 0
for i in range(min(len(s), len(t))):
    if s[i] != t[i]:
        break
    ans += 1

print(len(s) + len(t) - 2 * ans)
```


```python
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    if a[i] != 0:
        ans.append(i + 1)

print(len(ans))
print(*ans)
```

## 3. 1005B - Delete from the Left

You are given two strings s and t. You can delete some (possibly, none or all) characters from the beginning of s and some (possibly, none or all) characters from the beginning of t so that the strings become equal.

For example, if s = "abacaba" and t = "ac", then you can delete the first character from s and the second character from t so that the strings become equal.

What is the minimum number of characters you have to delete from the beginning of the strings so that the strings become equal?

Input
The first line contains a non-empty string s consisting of lowercase Latin letters. The length of s is no more than 100.

The second line contains a non-empty string t consisting of lowercase Latin letters. The length of t is no more than 100.

Output
Print a single integer — the minimum number of characters you have to delete from the beginning of the strings so that the strings become equal.

Sample test(s)
input
abacaba
ac
output
2
input
a
aa
output
1
input
ababa
baba
output
0

```python
s = input()
t = input()

ans = 0
for i in range(min(len(s), len(t))):
    if s[i] != t[i]:
        break
    ans += 1

print(len(s) + len(t) - 2 * ans)
```
/codeforces/1005/README.md
# Codeforces Round #544 (Div. 3)

## 1. 1005A - Tanya and Stairways

Tanya is very excited about the upcoming programming contest, so she decided to play with numbers. She took a sequence of n integers a1, a2, ..., an and started to play with it.

First, she wrote down all the integers from 1 to n on a piece of paper. Then she started to erase some of the numbers. The girl erased the number i if and only if ai = 0. After that she wrote down all the remaining numbers in the order in which they appeared on the paper.

For example, if n = 6 and a = [1, 0, 2, 0, 3, 0], then Tanya wrote down the numbers [1, 2, 3, 6].

Your task is to find out which numbers Tanya wrote down.

Input
The first line of the input contains a single integer n (1 ≤ n ≤ 100) — the number of integers in the sequence.

The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100) — the sequence of integers.

Output
In the first line print a single integer k — the number of remaining numbers.

In the second line print k integers — the numbers that Tanya wrote down in the order in which they appeared in the sequence.

Sample test(s)
input
6
1 0 2 0 3 0
output
3
1 2 3
input
5
1 2 3 4 5
output
5
1 2 3 4 5
input
5
1 0 0 0 0
output
1
1/codeforces/1005/1005A.py
n = int(input())
a = list(map(int, input().split()))

ans = []
for i in range(n):
    if a[i] != 0:
        ans.append(i + 1)

print(len(ans))
print(*ans)
/codeforces/100
