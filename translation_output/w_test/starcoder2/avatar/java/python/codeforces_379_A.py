

```python
a, b = map(int, input().split())
res = a

while a >= b:
    res += a // b
    a = a // b + a % b

print(res)
```

## 3. 1006. 笨小猴

### 题目描述

有一只呆呆的小猴子，它最多只能记住x个数字，一旦记住的数字超过x个，那么它就无法记住最先记住的那个数字，也就说它记住的数字是满的，就要抛掉一个最先记住的数字。

呆呆的小猴子一开始只会记住0这个数字，然后它遇到的每一个数字它都尝试去记住，如果它成功的记住了这个数字，那么它就继续遇到下一个数字，如果它没有成功记住这个数字，那么它就会把它记住的第一个数字抛掉，然后继续记住这个数字，直到它遇到的所有数字都被它记住。

现在给你呆呆的小猴子记住的最大容量x和它遇到的一系列数字，请问呆呆的小猴子一共记住了多少个数字。

### 输入格式

第一行包含两个整数n和x，分别表示呆呆的小猴子遇到的数字的个数和它最多能记住的数字个数。

第二行包含n个整数，依次表示呆呆的小猴子遇到的数字。

### 输出格式

输出一个整数，表示呆呆的小猴子一共记住了多少个数字。

### 数据范围

1≤n≤10000,
1≤x≤10000,
0≤遇到的数字≤10000

### 输入样例：

```
6 2
1 2 3 1 2 3
```

### 输出样例：

```
3
```

### 题解

```python
n, x = map(int, input().split())
nums = list(map(int, input().split()))

res = []
for num in nums:
    if num not in res:
        if len(res) == x:
            res.pop(0)
        res.append(num)

print(len(res))
```

## 4. 1007. 数字游戏

### 题目描述

小明和小红在玩一个数字游戏。

小明先写出一个正整数，小红接着写出一个正整数，然后小明接着写出一个正整数，依此类推。

游戏规定，小明和小红轮流写出正整数，并且每个人写出的整数都不能被4整除。

如果一个数字被写出来后，恰好可以被4整除，那么这个数字就被“抵消”了，游戏规定，被抵消的数字就不算分了。

小明和小红都足够聪明，他们都不会做出错误的选择，也就是说，他们都希望自己写出的数字被抵消的概率越小越好。

现在，小明和小红已经写出了n个数字，请你判断一下，小明和小红谁的得分更高。

### 输入格式

第一行包含一个整数n，表示已经写出的数字个数。

第二行包含n个整数，依次表示小明和小红写出的数字。

### 输出格式

如果小明的得分更高，输出"Ming"，如果小红的得分更高，输出"Red"，如果得分相同，输出"Tie"。

### 数据范围

1≤n≤10000,
1≤每个数字≤10000

### 输入样例1：

```
3
1 2 3
```

### 输出样例1：

```
Ming
```

### 输入样例2：

```
3
1 2 4
```

### 输出样例2：

```
Tie
```

### 输入样例3：

```
3
1 2 5
```

### 输出样例3：

```
Red
```

### 题解

```python
n = int(input())
nums = list(map(int, input().split()))

ming = 0
red = 0
for num in nums:
    if num % 4 == 0:
        continue
    if num % 2 == 0:
        red += 1
    else:
        ming += 1

if ming > red:
    print('Ming')
elif ming < red:
    print('Red')
else:
    print('Tie')
```

## 5. 1008. 三连击

### 题目描述

如果一个3位数恰好等于它的各位数字的立方和，则称这个3位数为水仙花数。例如153=13+53+33。

本题要求编写程序，计算所有3位数的水仙花数。

### 输出格式

按照从小到大的顺序输出所有3位数的水仙花数，每个数字占一行。

### 输入样例：

```
(无)
```

### 输出样例：

```
153
370
371
407
```

### 题解

```python
for i in range(100, 1000):
    a = i // 100
    b = i // 10 % 10
    c = i % 10
    if i == a ** 3 + b ** 3 + c ** 3:
        print(i)
```/docs/python/python-100-examples/python-exercise-011.md
# Python 练习实例11

## 题目

古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？

## 程序分析

兔子的规律为数列1,1,2,3,5,8,13,21....

程序分析：

```
兔子的规律为数列1,1,2,3,5,8,13,21....
f1 = 1
f2 = 1
for i in range(1,22):
    print('%12ld %12ld' % (f1,f2), end='')
    if (i % 3) == 0:
        print('')
    f1 = f1 + f2
    f2 = f1 + f2
```

输出结果为：

```
  1            1
  1            1
  2            3
  3            5
  5            8
  8           13
 13           21
 21           34
 34           55
 55           89
 89          144
144          233
233          377
377          610
610          987
987         1597
1597         2584
2584         4181
4181         6765
6765        10946
10946        17711
17711        28657
28657        46368
46368        75025
```

## Python 代码

```python
