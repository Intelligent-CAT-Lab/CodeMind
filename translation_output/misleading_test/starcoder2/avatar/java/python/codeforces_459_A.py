
```python
x1, y1, x2, y2 = map(int, input().split())

if x1 == x2:
    dif = abs(y1 - y2)
    print(x1 + dif, y1, x1 + dif, y2)
elif y1 == y2:
    dif = abs(x1 - x2)
    print(x1, y1 + dif, x2, y2 + dif)
elif abs(x1 - x2) == abs(y1 - y2):
    print(x1, y2, x2, y1)
else:
    print(-1)
```

## 460A. Vasya and Socks

Vasya has n socks left from the last washing machine. He wants to sell them. Vasya sells the first pair of socks and then he throws away one of the socks. He sells the second pair of socks and then he throws away one of the socks. He continues this process until he has no more socks.

Vasya wants to know how many socks he will have left after the process.

Input
The first line contains two integers n and m (1 ≤ n ≤ 1000, 1 ≤ m ≤ 1000) — the number of socks Vasya has and the number of socks he sells in a pair.

Output
Print a single integer — the number of socks Vasya will have left after the process.

Sample test(s)
input
17 4
output
3
input
2 3
output
0

```python
n, m = map(int, input().split())

print(n - (n // m) * (m - 1))
```

## 461A. Appleman and Toastman

Appleman has n apples. He wants to eat them.

Initially, Appleman eats one apple. Then he eats two apples. Then he eats three apples. Then he eats four apples. And so on. In other words, in the i-th minute Appleman eats i apples.

Your task is to find out how many apples Appleman will be able to eat.

Input
The first line contains a single integer n (1 ≤ n ≤ 1000) — the number of apples Appleman has.

Output
Print a single integer — the number of apples Appleman will eat.

Sample test(s)
input
5
output
15
input
1
output
1

```python
n = int(input())

print(n * (n + 1) // 2)
```

## 462A. Appleman and Card Game

Appleman has a deck of n cards. Each card has a positive integer written on it.

Appleman wants to divide all the cards into two piles. He wants the difference between the sum of numbers on cards in the first pile and the sum of numbers on cards in the second pile to be as small as possible.

Help Appleman to divide the cards into two piles.

Input
The first line contains a single integer n (1 ≤ n ≤ 100) — the number of cards in the deck.

The second line contains n space-separated integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the numbers written on the cards.

Output
Print two lines. The first line should contain the number of cards in the first pile. The second line should contain the numbers written on the cards in the first pile.

If there are multiple optimal answers, print any of them.

Sample test(s)
input
4
1 2 3 4
output
2
1 2
input
5
1 1 1 1 1
output
3
1 1 1

```python
n = int(input())
a = list(map(int, input().split()))

s = sum(a)

if s % 2 == 0:
    print(n // 2)
    print(*a[:n // 2])
else:
    print(n // 2 + 1)
    print(*a[:n // 2 + 1])
```

## 463A. Caisa and Pylons

Caisa is a girl who loves to play with pylons.

There are n pylons in a row. The i-th pylon has height hi. Caisa starts at the first pylon and wants to reach the last one. She can move from the i-th pylon to the (i + 1)-th pylon if and only if hi ≤ hi + 1.

Caisa can jump from the i-th pylon to the (i + k)-th pylon if and only if hi ≤ hi + k.

Caisa can move from the i-th pylon to the (i + 1)-th pylon or jump from the i-th pylon to the (i + k)-th pylon.

Caisa wants to know the minimum number of moves she needs to reach the last pylon.

Input
The first line contains two integers n and k (1 ≤ n ≤ 100, 1 ≤ k ≤ 100) — the number of pylons and the maximum length of a jump.

The second line contains n integers h1, h2, ..., hn (1 ≤ hi ≤ 100) — the heights of the pylons.

Output
Print a single integer — the minimum number of moves Caisa needs to reach the last pylon. If it is impossible to reach the last pylon, print -1.

Sample test(s)
input
5 2
1 2 3 4 5
output
4
input
5 2
1 2 3 1 2
output
-1
input
5 3
1 2 3 1 2
output
2

```python
n, k = map(int, input().split())
h = list(map(int, input().split()))

ans = 0

for i in range(n - 1):
    if h[i] > h[i + 1]:
        ans += h[i] - h[i + 1]

if h[-1] > h[-2]:
    ans += h[-1] - h[-2]

print(ans)
```

## 466A. Cheap Travel

A bus tour group of n people (let's number them from 0 to n - 1) is going to visit Polycarp. They definitely won't forget to visit him, but they want to do it as cheap as possible.

The group has a big bag with coins
