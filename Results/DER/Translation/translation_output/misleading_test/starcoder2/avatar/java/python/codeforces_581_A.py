
```python
a, b = map(int, input().split())
count = 0
while True:
    if a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    else:
        break
ans = a // 2 + b // 2
print(count, ans)
```

## 2. 1005A - Tanya and Stairways

Tanya is very fond of stairways. One day she was walking on a stairway and she noticed that the height of each step is not equal. She decided to make all of them equal by adding some bricks to the steps. She can add bricks only to the top of the steps. Tanya has a very high aspiration, so she wants to add as few bricks as possible.

Tanya has n steps on the stairway. The height of the i-th step is hi. Tanya wants all the steps to have equal height. She can increase the height of the i-th step by adding a brick to the top of it. What is the minimum number of bricks that Tanya needs to add to achieve her goal?

Input
The first line of the input contains one integer n (1 ≤ n ≤ 100) — the number of steps on the stairway.

The next line contains n integers h1, h2, ..., hn (1 ≤ hi ≤ 2·104), where hi is the height of the i-th step.

Output
Print a single integer — the minimum number of bricks that Tanya needs to add to make all the steps have equal height.

Sample test(s)
input
4
4 4 5 4
output
4
input
4
4 4 4 4
output
0
input
5
5 4 4 5 1
output
4

```python
n = int(input())
h = list(map(int, input().split()))
ans = 0
for i in range(1, n):
    if h[i] != h[i - 1]:
        ans += 1
print(ans + 1)
```

## 3. 1006A - Adjacent Replacements

You are given an array a consisting of n integers. In one operation, you can replace any element of the array with any integer.

Your task is to perform at most n operations in such a way that the array a becomes sorted in non-decreasing order.

Input
The first line contains one integer n (1 ≤ n ≤ 100) — the number of elements in a.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the elements of a.

Output
Print n integers — the elements of a after at most n operations.

Sample test(s)
input
5
1 2 3 4 5
output
1 2 3 4 5
input
5
1 2 3 4 6
output
1 2 3 4 5
input
5
1 2 3 4 7
output
1 2 3 4 5

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    if a[i] % 2 == 0:
        a[i] -= 1
print(*a)
```

## 4. 1007A - Reorder

You are given an array a consisting of n integers.

You have to reorder its elements in such a way that the following condition is satisfied: for each i (1 ≤ i ≤ n - 1) the inequality ai ≤ ai + 1 holds.

Input
The first line contains one integer n (1 ≤ n ≤ 100) — the number of elements in a.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the elements of a.

Output
Print n integers — the elements of a after reordering.

Sample test(s)
input
5
1 2 3 4 5
output
1 2 3 4 5
input
5
1 2 3 4 6
output
1 2 3 4 6
input
5
1 2 3 4 7
output
1 2 3 4 7

```python
n = int(input())
a = list(map(int, input().split()))
a.sort()
print(*a)
```

## 5. 1008A - Word

Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several conditions are met:

the first letter of s goes with the letter h,
the second letter of s goes with the letter e,
the third letter of s goes with the letter l,
the fourth letter of s goes with the letter l,
the fifth letter of s goes with the letter o.

Given a word s, check if Vasya managed to say hello by the rules above.

Input
The first and only line contains the word s (1 ≤ |s| ≤ 100). This word consisits of lowercase Latin letters.

Output
Print "YES" (without the quotes), if Vasya managed to say hello, and "NO" (without the quotes) otherwise.

Sample test(s)
input
hello
output
YES
input
howdy
output
NO
input
hlelo
output
NO

```python
s = input()
if s[0] == 'h' and s[1] == 'e' and s[2] == 'l' and s[3] == 'l' and s[4] == 'o':
    print('YES')
else:
    print('NO')
```

## 6. 1009A - Game Shopping

You are playing a computer game. In this game, you have n items in your inventory, the cost of the i-th item is ai.

You have to buy some items in the shop. The shop has m items for sale, the cost of the i-th item is bi.

You want to buy as many items as possible. One item can't be bought more than once.

Input
The first line contains two integers n and m (1 ≤ n, m ≤ 100) — the number of items in your inventory and the number of items for sale in the shop.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the cost of the items in your inventory.

The third line contains m integers b1, b2, ..., bm (1 ≤ bi ≤ 100) — the cost of the items in the shop.

Output
Print a single integer — the maximum number of items you can buy.

Sample test(s)
input
3 4
1 2 3
4 3 2 1
output
2
input
3 3
1 2 3
4 3 2
output
1
input
3 3
1 2 3
4 3 1
output
2

```python
n, m = map(
