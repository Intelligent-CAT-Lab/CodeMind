
```python
S = input()
N = len(S)
ans = [0]*N
curIndex = 0
while curIndex < N:
    numLeft = 0
    numRight = 0
    while S[curIndex] == 'R':
        numRight += 1
        curIndex += 1
        if curIndex == N:
            break
    R = curIndex - 1
    while S[curIndex] == 'L':
        numLeft += 1
        curIndex += 1
        if curIndex == N:
            break
    left = numLeft
    right = numRight
    if (left + right) % 2 == 0:
        sum = left + right
        left = sum // 2
        right = sum // 2
    else:
        sum = left + right
        if right % 2 == 1:
            right = sum // 2
            left = sum - right
        else:
            left = sum // 2
            right = sum - left
    ans[R] = left
    ans[R + 1] = right
    if curIndex == N - 1:
        break
for i in range(N):
    print(ans[i], end=' ')
```

## 2.2.2.2. 10055 - Hashmat the Brave Warrior

### 2.2.2.2.1. Problem

Hashmat the brave warrior is encamped and waiting for opponents to come. He wants to know how many soldiers are their, so he asks for their enlistment number. The problem is that the number is so huge to count. So he decides to use a computer program. Your job is to count the difference between their enlistment number and Hashmat's enlistment number.

### 2.2.2.2.2. Input

There will be a number of cases. Each case consists of two integers. The first is Hashmat's enlistment number, and the second is the enlistment number of the enemy. They may or may not be in order.

### 2.2.2.2.3. Output

For each case, print the difference between the two numbers, i.e., the first number minus the second number.

### 2.2.2.2.4. Sample Input

```
10 42
42 21
1000000000 22
```

### 2.2.2.2.5. Sample Output

```
32
21
999999978
```

### 2.2.2.2.6. Solution

```python
while True:
    try:
        a, b = map(int, input().split())
        print(abs(a - b))
    except EOFError:
        break
```

## 2.2.2.3. 10071 - Back to High School Physics

### 2.2.2.3.1. Problem

Back to high school physics, a simple problem. The formula is s = ut + 1/2at2 where s is the distance, u is the initial velocity, t is the time and a is the acceleration. You will be given the values u and t. Can you find out the value of s?

### 2.2.2.3.2. Input

The first line of input contains an integer N (N < 10000) which indicates how many sets of inputs are there. Each of the next N lines contains two integers, u and t (|u| < 20, |t| < 100000000).

### 2.2.2.3.3. Output

For each line of input, generate a line of output having a single integer which is the value of s.

### 2.2.2.3.4. Sample Input

```
2
0 0
5 12
```

### 2.2.2.3.5. Sample Output

```
0
180
```

### 2.2.2.3.6. Solution

```python
N = int(input())
for i in range(N):
    u, t = map(int, input().split())
    print(2 * u * t)
```

## 2.2.2.4. 10110 - Light, more light

### 2.2.2.4.1. Problem

The problem is as follows: given a light bulb, you turn it on, and a counter starts counting up the number of seconds that the light is on. If the light is off, the counter resets to zero. You can turn the light on and off any number of times.

Given a sequence of values for the counter, determine the state of the light after the last value in the sequence was recorded.

### 2.2.2.4.2. Input

The input consists of a sequence of non-negative integers. Each integer is the number displayed on the counter when you recorded the state of the light. The last value in the sequence is followed by a zero, which signals the end of the input. You may assume that the input contains at most 10000 numbers.

### 2.2.2.4.3. Output

For each non-zero input value, display a line stating whether the light was on or off when you recorded the value.

### 2.2.2.4.4. Sample Input

```
3
0
```

### 2.2.2.4.5. Sample Output

```
off
```

### 2.2.2.4.6. Solution

```python
while True:
    n = int(input())
    if n == 0:
        break
    if int(n ** 0.5) ** 2 == n:
        print('yes')
    else:
        print('no')
```

## 2.2.2.5. 10114 - Loansome Car Buyer

### 2.2.2.5.1. Problem

A loansome car buyer has to pay back a loan of L dollars over N months. He decides to pay the minimum monthly payment of P dollars, and to pay the remaining balance B at the end of the N months.

Car loans are computed by a scheme called an amortization plan. The monthly payment P has to pay off the loan in a sequence of monthly payments. The first payment of P dollars is deducted from the loan, reducing the balance by P dollars. Then P dollars is deducted from the new balance, reducing the new balance by P
