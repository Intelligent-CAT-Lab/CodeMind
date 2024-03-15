
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int R = sc.nextInt();
        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
```
/docs/python/python-100-examples/python-exercise-example10.md
# Python 练习实例10

## 题目

暂停一秒输出。

### 题解

```python
import time

myD = {1: 'a', 2: 'b'}
for key, value in dict.items(myD):
    print(key, value)
    time.sleep(1)  # 暂停1秒
```

### 题目

暂停一秒输出，并格式化当前时间。

### 题解

```python
import time

print(time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))
# 暂停一秒
time.sleep(1)
print(time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))
```

### 题目

求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加由键盘控制。

### 题解

```python
Tn = 0
Sn = []
n = int(input('n = '))
a = int(input('a = '))
for count in range(n):
    Tn = Tn + a
    a = a * 10
    Sn.append(Tn)
    print(Tn)

Sn = reduce(lambda x, y: x + y, Sn)
print("计算和为：", Sn)
```

### 题目

一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？

### 题解

```python
import math

for i in range(10000):
    # 转化为整型值
    x = int(math.sqrt(i + 100))
    y = int(math.sqrt(i + 268))
    if (x * x == i + 100) and (y * y == i + 268):
        print(i)
```

### 题目

输入某年某月某日，判断这一天是这一年的第几天？

### 题解

```python
year = int(input('year:\n'))
month = int(input('month:\n'))
day = int(input('day:\n'))

months = (0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)
if 0 < month <= 12:
    sum = months[month - 1]
else:
    print('data error')
sum += day
leap = 0
if (year % 400 == 0) or ((year % 4 == 0) and (year % 100 != 0)):
    leap = 1
if (leap == 1) and (month > 2):
    sum += 1
print('it is the %dth day.' % sum)
```

### 题目

输入三个整数x,y,z，请把这三个数由小到大输出。

### 题解

```python
l = []
for i in range(3):
    x = int(input('integer:\n'))
    l.append(x)
l.sort()

print(l)
```

### 题目

斐波那契数列。

### 题解

```python
# 方法1
def fib(n):
    a, b = 1, 1
    for i in range(n - 1):
        a, b = b, a + b
    return a


# 方法2
def fib(n):
    if n == 1 or n == 2:
        return 1
    return fib(n - 1) + fib(n - 2)


# 方法3
def fib(n):
    if n == 1:
        return [1]
    if n == 2:
        return [1, 1]
    fibs = [1, 1]
    for i in range(2, n):
        fibs.append(fibs[-1] + fibs[-2])
    return fibs


# 方法4
def fib(n):
    a, b = 0, 1
    while b < n:
        print(b, end=' ')
        a, b = b, a + b
    print()


# 方法5
def fib(n):
    if n == 0:
        return []
    if n == 1:
        return [1]
    fibs = [1, 1]
    while len(fibs) < n:
        fibs.append(fibs[-1] + fibs[-2])
    return fibs


# 输出前10个斐波那契数列
print(fib(10))
```

### 题目

将一个列表的数据复制到另一个列表中。

### 题解

```python
a = [1, 2, 3]
b = a[:]
print(b)
```

### 题目

暂停一秒输出。

### 题解

```python
import time

myD = {1: 'a', 2: 'b'}
for key, value in dict.items(myD):
    print(key, value)
    time.sleep(1)  # 暂停1秒
```

### 题目

暂停一秒输出，并格式化当前时间。

### 题解

```python
import time

print(time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))
# 暂停一秒
time.sleep(1)
print(time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))
```

### 题目

求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加由键盘控制。

### 题解

```python
Tn = 0
Sn = []
n = int(input('n = '))
a = int(input('a = '))
for count in range(n):
    Tn = Tn + a
    a = a * 10
    Sn.append(Tn)
    print(Tn)

Sn = reduce(lambda x, y: x + y, Sn)
print("计算和为：", Sn)
```

### 题目

一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？

### 题解

```python
import math

for i in range(10000):
    # 转化为整型值
    x = int(math.sqrt(i + 100))
    y = int(math.sqrt(i + 268))
    if (x * x == i + 100) and (y * y == i + 268):
        print(i)
```

### 题目

输入某年某月某日，判断这一天是这一年的第几天？

### 题解


