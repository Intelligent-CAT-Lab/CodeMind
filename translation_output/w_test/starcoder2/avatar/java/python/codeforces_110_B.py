
```python
n = int(input())
if n == 1:
    print('a')
elif n == 2:
    print('ab')
elif n == 3:
    print('abc')
else:
    print('abcd' * (n // 4), end='')
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print('ab')
    elif t == 3:
        print('abc')
```

## 111A. Petya and Strings

Petya loves strings very much. Recently he had a lot of fun. He liked to invent new string games. One day Petya invented a new string game and decided to play it.

Let's go to the rules of the game. You are given two strings s and t of the same length, consisting of uppercase and lowercase Latin letters. The game consists of several steps. At the i-th step you can perform one of the two following actions with the string s:

replace its some character by the other character (i.e. replace all occurrences of the uppercase letter 'A' with the lowercase one, replace all occurrences of the lowercase letter 'a' with the uppercase one, etc.);
reverse the string s;
Your goal is to obtain the string t from the string s. It is allowed to perform steps in any order, each step can be used any number of times. It is not allowed to perform the given steps with the string t.

Input
The first line contains the string s, consisting of uppercase and lowercase Latin letters. The second line contains the string t, consisting of uppercase and lowercase Latin letters. The strings s and t have the same length, which doesn't exceed 100.

Output
Print "YES" (without the quotes), if it is possible to obtain the string t from the string s. Otherwise, print "NO" (without the quotes).

Examples
input
abBA
aBba
output
YES
input
abBA
Abac
output
NO
input
abBA
abBA
output
YES

```python
s = input()
t = input()

s = s.lower()
t = t.lower()

if s == t:
    print('YES')
else:
    print('NO')
```

## 112A. Petya and Strings

Petya loves strings very much. Recently he had a lot of fun. He liked to invent new string games. One day Petya invented a new string game and decided to play it.

Let's go to the rules of the game. You are given two strings s and t of the same length, consisting of uppercase and lowercase Latin letters. The game consists of several steps. At the i-th step you can perform one of the two following actions with the string s:

replace its some character by the other character (i.e. replace all occurrences of the uppercase letter 'A' with the lowercase one, replace all occurrences of the lowercase letter 'a' with the uppercase one, etc.);
reverse the string s;
Your goal is to obtain the string t from the string s. It is allowed to perform steps in any order, each step can be used any number of times. It is not allowed to perform the given steps with the string t.

Input
The first line contains the string s, consisting of uppercase and lowercase Latin letters. The second line contains the string t, consisting of uppercase and lowercase Latin letters. The strings s and t have the same length, which doesn't exceed 100.

Output
Print "YES" (without the quotes), if it is possible to obtain the string t from the string s. Otherwise, print "NO" (without the quotes).

Examples
input
abBA
aBba
output
YES
input
abBA
Abac
output
NO
input
abBA
abBA
output
YES

```python
s = input()
t = input()

s = s.lower()
t = t.lower()

if s == t:
    print('YES')
else:
    print('NO')
```

## 113A. Help Kingdom of Far Far Away 2

The Kingdom of Far Far Away 2 is a country in the far far away. The kingdom has n cities, numbered from 1 to n. There are m bidirectional roads between the cities. The i-th road connects the cities ai and bi.

The king of the kingdom wants to build a new road between two cities. But he is afraid that the new road will be built too close to the capital. So he wants to build the road in such a way that the maximum distance between the capital and any other city is as small as possible.

The capital is the city number 1. The distance between two cities is the minimum number of roads one needs to pass to get from one city to another.

Input
The first line contains two integers n and m (2 ≤ n ≤ 105, 1 ≤ m ≤ 105) — the number of cities and the number of roads in the kingdom.

The next m lines contain the descriptions of the roads. The i-th line contains two integers ai and bi (1 ≤ ai, bi ≤ n, ai ≠ bi) — the cities connected by the i-th road.

It is guaranteed that there are no more than 105 roads between any pair of cities.

Output
Print a single integer — the maximum distance between the capital and any other city after building the new road.

Examples
input
4 3
1 2
2 3
3 4
output
2
input
5 4
1 2
2 3
3 4
4 5
output
3

```python
n, m = map(int, input().split())

max_dist = 0
for i in range(m):
    a, b = map(int, input().split())
    if a == 1 or b == 1:
        max_dist = max(max_dist, max(a, b) - 1)

print(max_dist)
```

## 114A. Cifera

You are given two integers a and b. You have to find the number of such positive integers x, that a·x = b.

Input
The first line contains two integers a and b (1 ≤ a, b ≤ 109).

Output
Print the number of such positive integers x, that a·x = b.

Examples
input
2 4
output
2
input
3 1
output
0

```python
a, b = map(int, input().split())

if b % a == 0:
    print(b // a)
else:
    print(0)
```

## 115A. Party

There is a party at the University. All the n students of the university are invited. They want to get acquainted with each other. The students are numbered from 1 to n.

Some students know each other, some don't. You know the direction of the friendship between each pair of students who know each other.

Your task is to determine the size of the largest group of students who know each other directly or indirectly.

Input
The first line contains integer n (1 ≤ n ≤ 5000) — the number of students in the university.

Each of the next n lines contains a description of the student
