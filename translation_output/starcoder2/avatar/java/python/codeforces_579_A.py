
```
n = int(input())
s = " "

while n > 0:
    x = n % 2
    n //= 2
    s += str(x) + " "

ans = 0

for i in range(len(s)):
    if s[i] == '1':
        ans += 1

print(ans)
```

## 579B - Sereja and Dima

### Problem
Sereja and Dima are playing a game. They have n cards, each card has a number written on it. Sereja and Dima move in turns, Sereja moves first. In one move a player can take one card from the top of the deck and either add this card to the top of his pile, or to the bottom of his pile. The game ends when all cards are taken. The player who has more points in the end of the game, wins.

Sereja and Dima are very clever and they play optimally. You have to determine the number of points Sereja will get if both of them play optimally.

### Input
The first line contains integer n (1 ≤ n ≤ 100) — the number of cards in the deck. The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 1000) — the numbers written on the cards.

### Output
Print a single integer — the number of points Sereja will get if both of them play optimally.

### Examples
input
```
3
1 2 3
```
output
```
2
```
input
```
4
1 2 3 4
```
output
```
3
```

### Note
In the first sample Sereja can take the card with number 1, then Dima can take the card with number 2 and Sereja can take the card with number 3. In the end Sereja will have two cards with numbers 1 and 3, so he will get 2 points.

In the second sample Sereja can take the card with number 1, then Dima can take the card with number 2, then Sereja can take the card with number 3 and Dima can take the card with number 4. In the end Sereja will have two cards with numbers 1 and 3, so he will get 2 points.

### Solution

```
n = int(input())
a = list(map(int, input().split()))

s = 0
d = 0

while len(a) > 0:
    if a[0] > a[-1]:
        s += a[0]
        a.pop(0)
    else:
        s += a[-1]
        a.pop(-1)

    if len(a) == 0:
        break

    if a[0] > a[-1]:
        d += a[0]
        a.pop(0)
    else:
        d += a[-1]
        a.pop(-1)

print(s, d)
```

## 579C - Raising Bacteria

### Problem
You are given an integer n. You have to represent it as a sum of powers of two.

### Input
The first line contains integer n (1 ≤ n ≤ 1018).

### Output
Print the minimum number of powers of two that sum up to n.

### Examples
input
```
1
```
output
```
1
```
input
```
7
```
output
```
3
```

### Note
In the first sample 1 = 20.

In the second sample 7 = 22 + 21 + 20.

### Solution

```
n = int(input())

ans = 0

while n > 0:
    ans += 1
    n //= 2

print(ans)
```

## 579D - Misha and Forest

### Problem
Misha has a rooted tree consisting of n vertices. The root of the tree is the vertex number 1. Each vertex has a color. The color of the vertex i is ai.

Misha wants to paint the tree in black and white colors. He can paint the vertex in black or white. The tree is considered beautiful if and only if for each vertex the following condition is satisfied: the number of black vertices in the subtree of this vertex is equal to the number of white vertices in the subtree of this vertex.

Misha wants to paint the tree in such a way that the number of black vertices is maximum possible. Help him to do that.

### Input
The first line contains integer n (1 ≤ n ≤ 105) — the number of vertices in the tree.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 109) — the colors of the vertices.

Next n - 1 lines contain the edges of the tree. Each line contains two integers ui, vi (1 ≤ ui, vi ≤ n, ui ≠ vi) — the vertices connected by the edge.

It is guaranteed that the given graph is a tree.

### Output
Print a single integer — the maximum possible number of black vertices in the tree.

### Examples
input
```
3
1 2 3
1 2
2 3
```
output
```
2
```
input
```
4
1 2 3 4
1 2
2 3
3 4
```
output
```
3
```

### Note
In the first sample the tree is beautiful if the vertex 1 is black and the vertices 2 and 3 are white.

In the second sample the tree is beautiful if the vertices 1, 2 and 3 are black and the vertex 4 is white.

### Solution

```
n = int(input())
a = list(map(int, input().split()))

tree = [[] for i in range(n)]

for i in range(n - 1):
    u, v = map(int, input().split())
    tree[u - 1].append(v - 1)
    tree[v - 1].append(u - 1)

ans = 0

for i in range(n):
    if a[i] % 2 == 0:
        ans += 1

print(ans)
```

## 579E - Watto and Mechanism

### Problem
Watto is a mechanic. He has a mechanism consisting of n parts. The parts are numbered from 1 to n. The parts are connected by n - 1 cables. Each cable connects two parts. The parts are connected in such a way that there is exactly one way to get from any part to any other part.

Watto wants to replace some parts of the mechanism. He has a list of m parts he wants to replace. For each part he knows the cost of replacement.

Watto wants to replace the parts in such a way that the total cost of replacement is minimum possible and the mechanism will still work. The mechanism will work if and only if for each pair of parts there is a path between them that does not contain any of the replaced parts.

Help Watto to find the minimum possible cost of replacement of the parts.

### Input
The first line contains two integers n and m (1 ≤ n, m ≤ 105) — the number of parts in the mechanism and the number of parts Watto wants to replace.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 109) — the costs of replacement of
