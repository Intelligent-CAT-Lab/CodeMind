
```python
n = int(input())
print(n, end=' ')
m = n
for i in range(n-1, 0, -1):
    if m % i == 0:
        print(i, end=' ')
        m = i
```

## 2. 1000A - Codehorses T-shirts

### 2.1. Description

Codehorses is a company that produces T-shirts. The company has a catalog of T-shirts, each of which has a unique number.

The company has n customers, each of which has a list of T-shirts that he wants to buy.

The company wants to know how many T-shirts it will have to produce so that each customer can buy at least one T-shirt.

### 2.2. Input

The first line contains a single integer n (1 ≤ n ≤ 100) — the number of customers.

Each of the following n lines contains a list of T-shirts that the corresponding customer wants to buy. The first number in the line is the number of T-shirts in the list (1 ≤ k ≤ 100). Then follow k numbers — the numbers of the T-shirts in the list. All numbers in the line are separated by spaces. All T-shirts are numbered from 1 to 100.

### 2.3. Output

Print a single number — the minimum number of T-shirts that the company needs to produce.

### 2.4. Sample test(s)

input
```
3
2 1 2
1 1
3 1 2 3
```
output
```
2
```

### 2.5. Solution

```python
n = int(input())

tshirts = set()

for i in range(n):
    tshirts_list = input().split()
    for tshirt in tshirts_list[1:]:
        tshirts.add(tshirt)

print(len(tshirts))
```

## 3. 1000B - Polycarp and Div 3

### 3.1. Description

Polycarp has a positive integer n. He wants to find the smallest positive integer k such that n is divisible by k.

### 3.2. Input

The first line contains a single integer n (1 ≤ n ≤ 100) — the number that Polycarp has.

### 3.3. Output

Print a single integer — the smallest positive integer k such that n is divisible by k.

### 3.4. Sample test(s)

input
```
10
```
output
```
10
```

### 3.5. Solution

```python
n = int(input())

for i in range(n, 0, -1):
    if n % i == 0:
        print(i)
        break
```

## 4. 1000C - The number on the board

### 4.1. Description

There is a board with n cells. The cells are numbered from 1 to n from left to right. Initially, the i-th cell contains the number ai.

You have to perform m operations. Each operation is one of the following:

1. Choose a cell i and increase the number in it by 1.
2. Choose a cell i and decrease the number in it by 1.

Your task is to find the maximum number that can be written on the board after performing all the operations.

### 4.2. Input

The first line contains two integers n and m (1 ≤ n, m ≤ 100) — the number of cells on the board and the number of operations, respectively.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the numbers written on the cells.

### 4.3. Output

Print a single integer — the maximum number that can be written on the board after performing all the operations.

### 4.4. Sample test(s)

input
```
3 3
1 2 3
```
output
```
4
```

### 4.5. Solution

```python
n, m = map(int, input().split())

a = list(map(int, input().split()))

a.sort()

for i in range(m):
    if a[0] < a[-1]:
        a[0] += 1
    else:
        a[-1] -= 1

print(max(a))
```

## 5. 1000D - The number on the board

### 5.1. Description

There is a board with n cells. The cells are numbered from 1 to n from left to right. Initially, the i-th cell contains the number ai.

You have to perform m operations. Each operation is one of the following:

1. Choose a cell i and increase the number in it by 1.
2. Choose a cell i and decrease the number in it by 1.

Your task is to find the maximum number that can be written on the board after performing all the operations.

### 5.2. Input

The first line contains two integers n and m (1 ≤ n, m ≤ 100) — the number of cells on the board and the number of operations, respectively.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the numbers written on the cells.

### 5.3. Output

Print a single integer — the maximum number that can be written on the board after performing all the operations.

### 5.4. Sample test(s)

input
```
3 3
1 2 3
```
output
```
4
```

### 5.5. Solution

```python
n, m = map(int, input().split())

a = list(map(int, input().split()))

a.sort()

for i in range(m):
    if a[0] < a[-1]:
        a[0] += 1
    else:
        a[-1] -= 1

print(max(a))
```

## 6. 1000E - The number on the board

### 6.1. Description

There is a board with n cells. The cells are numbered from 1 to n from left to right. Initially, the i-th cell contains the number ai.

You have to perform m operations. Each operation is one of the following:

1. Choose a cell i and increase the number in it by 1.
2. Choose a cell i and decrease the number in it by 1.

Your task is to find the maximum number that can be written on the board after performing all the operations.

### 6.2. Input

The first line contains two integers n and m (1 ≤ n, m ≤ 100) — the number of cells on the board and the number of operations, respectively.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the numbers written on the cells.

### 6.3. Output

Print a single integer — the maximum number that can be written on the board
