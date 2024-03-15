
```
o, n, g = map(int, input().split())
x = 0
for i in range(1, g+1):
    x += i * o

borrow = x - n
if borrow <= 0:
    print(0)
else:
    print(borrow)
```

## 546B - Soldier and Bananas

### Problem

A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

### Input

The first line contains three positive integers k, n, w (1 ≤ k ≤ 40, 0 ≤ n ≤ 1000, 1 ≤ w ≤ 1000).

### Output

Output one integer — the amount of money that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

### Examples

input
```
3 17 4
```
output
```
13
```

input
```
100 10 1
```
output
```
0
```

### Note

In the first sample the soldier can buy 4 bananas and spend 12 dollars. He still has 5 dollars that he needs to borrow from his friend.

In the second sample the soldier can buy 1 banana and spend 100 dollars. He has 10 dollars left after that. That means that he doesn't have to borrow any money.

### Solution

```
k, n, w = map(int, input().split())
x = 0
for i in range(1, w+1):
    x += i * k

borrow = x - n
if borrow <= 0:
    print(0)
else:
    print(borrow)
```

## 546C - Soldier and Cards

### Problem

There are n soldiers standing in a row. They are numbered by integers from 1 to n from left to right. Initially, the i-th soldier has ai battles experience.

The soldiers want to form a team. For that they will perform several operations. Each operation is one of the following two types:

1. Take the soldier number x from the front of the row and put him at the end of the row (the soldier that is currently in the position number x will become the last).
2. Take the soldier number y from the end of the row and put him in the front of the row (the soldier that is currently in the position number y will become the first).

Each soldier has his own battles experience. The soldier number x can take part in a team if and only if the soldier number x + 1 has strictly less battles experience than the soldier number x, the soldier number x + 2 has strictly less battles experience than the soldier number x + 1, and so on, the soldier number y - 1 has strictly less battles experience than the soldier number y, the soldier number y - 2 has strictly less battles experience than the soldier number y - 1, and so on.

Your task is to determine the minimum number of operations needed to form a team.

### Input

The first line contains a single integer n (1 ≤ n ≤ 105) — the number of soldiers.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 109), where ai is the number of battles experience of the i-th soldier.

### Output

Print a single integer — the minimum number of operations needed to form a team.

### Examples

input
```
5
1 2 3 4 5
```
output
```
0
```

input
```
5
5 4 3 2 1
```
output
```
4
```

input
```
5
1 2 4 3 5
```
output
```
1
```

### Note

In the first sample the soldiers are already in the right order, so you don't need to perform any operations.

In the second sample you need to perform 4 operations:

1. Take the soldier number 1 from the front of the row and put him at the end of the row.
2. Take the soldier number 5 from the end of the row and put him in the front of the row.
3. Take the soldier number 1 from the front of the row and put him at the end of the row.
4. Take the soldier number 5 from the end of the row and put him in the front of the row.

In the third sample you need to perform 1 operation:

1. Take the soldier number 3 from the end of the row and put him in the front of the row.

### Solution

```
n = int(input())
a = list(map(int, input().split()))

def check(a):
    for i in range(1, len(a)):
        if a[i] < a[i-1]:
            return False
    return True

def move_front(a, x):
    a.append(a.pop(x))
    return a

def move_back(a, y):
    a.insert(0, a.pop(y))
    return a

count = 0
while not check(a):
    for i in range(len(a)-1):
        if a[i] > a[i+1]:
            a = move_front(a, i)
            count += 1
            break
    for i in range(len(a)-1, 0, -1):
        if a[i] > a[i-1]:
            a = move_back(a, i)
            count += 1
            break

print(count)
```

## 546D - Soldier and Number Game

### Problem

A soldier has a number x. He can perform the following operation with his number any (possibly, zero) number of times: choose a positive integer d and divide his number x by d. He calls two numbers x and y friends if they can be obtained from each other using the described operation any (possibly, zero) number of times.

Your task is to find the number of pairs of friends among the first n positive integers.

### Input

The first line contains a single integer n (1 ≤ n ≤ 106).

### Output

Print a single integer — the number of pairs of friends among the first n positive integers.

### Examples

input
```
5
```
output
```
6
```

input
```
10
```
output
```
21
```

### Note

In the first sample the pairs of friends are: (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (2, 2).

In the second sample the pairs of friends are: (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7), (1, 8), (1, 9), (1, 10), (2, 2), (2, 4), (2, 6), (2, 8), (2, 1
