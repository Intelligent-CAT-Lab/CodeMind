
```python
n, k = map(int, input().split())
i = 1
req = 1
while k - req >= 0:
    if k - req >= 0:
        k = k - req
    else:
        break
    i += 1
    if i % n != 0:
        req = i % n
    else:
        req = n
print(k)
```

## 93. Codeforces 112A. Petya and Strings

Petya loves strings!!! He likes to solve problems related to strings. His current problem is about two strings ```a``` and ```b``` of the same length ```n```. The string ```a``` consists of lowercase Latin letters, and the string ```b``` consists of uppercase Latin letters.

Petya considers that the string ```a``` is lexicographically smaller than string ```b```, if for the first position ```i```, where the strings ```a``` and ```b``` differ, the string ```a``` has a letter that appears earlier in the alphabet than the corresponding letter in the string ```b```. In other words, the string ```a``` is lexicographically smaller than the string ```b```, if and only if either ```a1<b1```, or ```a1=b1``` and ```a2<b2```, or ```a1=b1```, ```a2=b2``` and ```a3<b3```, and so on. Here ```ai``` is the ```i```-th letter in the string ```a```, and ```bi``` is the ```i```-th letter in the string ```b```.

Your task is to determine which of the given strings is lexicographically smaller.

Input
The first line contains a non-empty string ```a```, consisting of lowercase Latin letters, the length of ```a``` does not exceed 100 letters. The second line contains the string ```b``` in the same format. The strings ```a``` and ```b``` have the same length, which doesn't exceed 100 letters.

Output
If the string ```a``` is lexicographically smaller than the string ```b```, print "-1". If these strings are equal, print "0". If the string ```a``` is lexicographically larger than the string ```b```, print "1".

Sample test(s)
input
aaaa
aaaA
output
0
input
abs
Abz
output
-1
input
abcdefg
ABCDEFG
output
1

```python
a = input()
b = input()

if a.lower() < b.lower():
    print(-1)
elif a.lower() > b.lower():
    print(1)
else:
    print(0)
```

## 94. Codeforces 116A. Tram

```python
n = int(input())

capacity = 0
max_capacity = 0

for i in range(n):
    a, b = map(int, input().split())
    capacity -= a
    capacity += b
    if capacity > max_capacity:
        max_capacity = capacity

print(max_capacity)
```

## 95. Codeforces 131A. cAPS lOCK

```python
s = input()

if s.isupper():
    print(s.lower())
elif s[0].islower() and s[1:].isupper():
    print(s[0].upper() + s[1:].lower())
else:
    print(s)
```

## 96. Codeforces 133A. HQ9+

```python
s = input()

if 'H' in s or 'Q' in s or '9' in s:
    print('YES')
else:
    print('NO')
```

## 97. Codeforces 136A. Presents

```python
n = int(input())

p = list(map(int, input().split()))

for i in range(n):
    print(p.index(i + 1) + 1, end=' ')
```

## 98. Codeforces 141A. Amusing Joke

```python
s1 = input()
s2 = input()
s3 = input()

s = s1 + s2

if sorted(s) == sorted(s3):
    print('YES')
else:
    print('NO')
```

## 99. Codeforces 148A. Insomnia cure

```python
k = int(input())
l = int(input())
m = int(input())
n = int(input())
d = int(input())

count = 0

for i in range(1, d + 1):
    if i % k == 0 or i % l == 0 or i % m == 0 or i % n == 0:
        count += 1

print(count)
```

## 100. Codeforces 158A. Next Round

```python
n, k = map(int, input().split())

a = list(map(int, input().split()))

count = 0

for i in range(n):
    if a[i] >= a[k - 1] and a[i] > 0:
        count += 1

print(count)
```

## 101. Codeforces 160A. Twins

```python
n = int(input())

a = list(map(int, input().split()))

a.sort(reverse=True)

sum_a = sum(a)

sum_b = 0

count = 0

for i in range(n):
    sum_b += a[i]
    sum_a -= a[i]
    count += 1
    if sum_b > sum_a:
        break

print(count)
```

## 102. Codeforces 189A. Cut Ribbon

```python
n, a, b, c = map(int, input().split())

max_len = 0

for i in range(n // a + 1):
    for j in range(n // b + 1):
        for k in range(n // c + 1):
            if i * a + j * b + k * c == n:
                max_len = max(max_len, i + j + k)

print(max_len)
```

## 103. Codeforces 199A. Helpful Maths

```python
s = input()

a = list(map(int, s.split('+')))

a.sort()

print('+'.join(map(str, a)))
```

## 104. Codeforces 200B. Drinks

```python
n = int(input())

p = list(map(int, input().split()))

print(sum(p) / n)
```

## 105. Codeforces 228A. Is your horseshoe on the other hoof?

```python
a = list(map(int, input().split()))

print(4 - len(set(a)))
```

## 106. Codeforces 231A. Team

```python
n = int(input())

count = 0

for i in range(n):
    p = list(map(int, input().split()))
    if p.count(1) >= 2:
        count += 1

print(count)
```

## 107. Codeforces 263A. Beautiful Matrix

```python
matrix = []

for i in range(5):
    matrix.append(list(map(int, input().split())))

for i in range(5):
    for j in range(
