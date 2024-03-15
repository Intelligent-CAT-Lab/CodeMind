
```
a, b = map(int, input().split())
res = a
while a >= b:
    res += a // b
    a = a // b + a % b
print(res)
```

## 381A

## 382A

## 385A

## 389A

## 399A

## 401A/codeforces/codeforces_379_A.py
a, b = map(int, input().split())
res = a
while a >= b:
    res += a // b
    a = a // b + a % b
print(res)
/codeforces/codeforces_381_A.py
n = int(input())
cards = list(map(int, input().split()))

alice = 0
bob = 0

while len(cards) > 0:
    if cards[0] > cards[-1]:
        alice += cards[0]
        cards = cards[1:]
    else:
        alice += cards[-1]
        cards = cards[:-1]

    if len(cards) == 0:
        break

    if cards[0] > cards[-1]:
        bob += cards[0]
        cards = cards[1:]
    else:
        bob += cards[-1]
        cards = cards[:-1]

print(alice, bob)
 1

print(res)
/codeforces/codeforces_385_A.py
n, k = map(int, input().split())
a = list(map(int, input().split()))

res = 0

for i in range(n):
    if a[i] == 0:
        continue
    if a[i] > k:
        res += a[i] - k
   /codeforces/codeforces_382_A.py
s, t = input().split()

s = list(s)

for i in range(len(s)):
    if s[i] == '.':
        s[i] = t
        break

print(''.join(s))
/codeforces/codeforces_389_A.py
n = int(input())
a = list(map

print(res)
(int, input().split()))

res = 1

for i in range(n):
    if a[i] % 2 == 0:
        res *= a[i]
    else:
        res *= a[i] - 1/codeforces/codeforces_399_A.py
n, k = map(int, input().split())
a = list(map(int, input().split()))

res = 0

for i in range(n):
    if a[i] == 0:
        continue
    if a[i] > k:
        res += a[i] - k
    else:
        res += 1

print(res)

