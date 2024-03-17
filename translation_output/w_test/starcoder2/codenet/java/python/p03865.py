

```python
s = input()
a = len(s)
flag = True
if s[0] == s[a-1]:
    if a%2 == 1:
        flag = False
    else:
        flag = True
else:
    if a%2 == 1:
        flag = True
    else:
        flag = False
if flag:
    print("First")
else:
    print("Second")
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

the output should be:

```
Number of times bob occurs is: 2
```

```python
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print("Number of times bob occurs is:", count)
```

## 5.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```python
s = input()
longest = s[0]
current = s[0]
for i in range(len(s)-1):
    if s[i+1] >= s[i]:
        current += s[i+1]
    else:
        if len(current) > len(longest):
            longest = current
        current = s[i+1]
if len(current) > len(longest):
    longest = current
print("Longest substring in alphabetical order is:", longest)
```
/README.md
# MITx-6.00.1x

This repository contains my solutions to the problem sets of MITx: 6.00.1x Introduction to Computer Science and Programming Using Python.

## Problem Set 1

- [Problem Set 1](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%201/Problem%20Set%201.md)

## Problem Set 2

- [Problem Set 2](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%202/Problem%20Set%202.md)

## Problem Set 3

- [Problem Set 3](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%203/Problem%20Set%203.md)

## Problem Set 4

- [Problem Set 4](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%204/Problem%20Set%204.md)

## Problem Set 5

- [Problem Set 5](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%205/Problem%20Set%205.md)

## Problem Set 6

- [Problem Set 6](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%206/Problem%20Set%206.md)

## Problem Set 7

- [Problem Set 7](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%207/Problem%20Set%207.md)

## Problem Set 8

- [Problem Set 8](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%208/Problem%20Set%208.md)

## Problem Set 9

- [Problem Set 9](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%209/Problem%20Set%209.md)

## Problem Set 10

- [Problem Set 10](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2010/Problem%20Set%2010.md)

## Problem Set 11

- [Problem Set 11](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2011/Problem%20Set%2011.md)

## Problem Set 12

- [Problem Set 12](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2012/Problem%20Set%2012.md)

## Problem Set 13

- [Problem Set 13](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2013/Problem%20Set%2013.md)

## Problem Set 14

- [Problem Set 14](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2014/Problem%20Set%2014.md)

## Problem Set 15

- [Problem Set 15](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2015/Problem%20Set%2015.md)

## Problem Set 16

- [Problem Set 16](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2016/Problem%20Set%2016.md)

## Problem Set 17

- [Problem Set 17](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2017/Problem%20Set%2017.md)

## Problem Set 18

- [Problem Set 18](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2018/Problem%20Set%2018.md)

## Problem Set 19

- [Problem Set 19](https://github.com/sahil-kale/MITx-6.00.1x/blob/master/Problem%20Set%2019/Problem%20Set%2019.md)

## Problem Set 20


