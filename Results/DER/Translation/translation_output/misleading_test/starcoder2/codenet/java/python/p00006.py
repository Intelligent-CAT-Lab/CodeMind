
```python
str = input()
ret = ""
for i in range(len(str)):
    ch = str[len(str) - i - 1]
    ret += ch
print(ret)
```

## 00007

Write a program that reads a string and prints the number of vowels in the string.

Test input:

```
hello world
```

Expected output:

```
3
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == 'a' or str[i] == 'e' or str[i] == 'i' or str[i] == 'o' or str[i] == 'u':
        count += 1
print(count)
```

## 00008

Write a program that reads a string and prints the number of consonants in the string.

Test input:

```
hello world
```

Expected output:

```
7
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] != 'a' and str[i] != 'e' and str[i] != 'i' and str[i] != 'o' and str[i] != 'u':
        count += 1
print(count)
```

## 00009

Write a program that reads a string and prints the number of digits in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] >= '0' and str[i] <= '9':
        count += 1
print(count)
```

## 00010

Write a program that reads a string and prints the number of spaces in the string.

Test input:

```
hello world
```

Expected output:

```
1
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == ' ':
        count += 1
print(count)
```

## 00011

Write a program that reads a string and prints the number of uppercase letters in the string.

Test input:

```
hello world
```

Expected output:

```
2
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] >= 'A' and str[i] <= 'Z':
        count += 1
print(count)
```

## 00012

Write a program that reads a string and prints the number of lowercase letters in the string.

Test input:

```
hello world
```

Expected output:

```
8
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] >= 'a' and str[i] <= 'z':
        count += 1
print(count)
```

## 00013

Write a program that reads a string and prints the number of special characters in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] < '0' or (str[i] > '9' and str[i] < 'A') or (str[i] > 'Z' and str[i] < 'a') or str[i] > 'z':
        count += 1
print(count)
```

## 00014

Write a program that reads a string and prints the number of words in the string.

Test input:

```
hello world
```

Expected output:

```
2
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == ' ':
        count += 1
print(count + 1)
```

## 00015

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == str[len(str) - i - 1]:
        count += 1
print(count)
```

## 00016

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == str[len(str) - i - 1]:
        count += 1
print(count)
```

## 00017

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == str[len(str) - i - 1]:
        count += 1
print(count)
```

## 00018

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == str[len(str) - i - 1]:
        count += 1
print(count)
```

## 00019

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == str[len(str) - i - 1]:
        count += 1
print(count)
```

## 00020

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == str[len(str) - i - 1]:
        count += 1
print(count)
```

## 00021

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str[i] == str[len(str) - i - 1]:
        count += 1
print(count)
```

## 00022

Write a program that reads a string and prints the number of palindromes in the string.

Test input:

```
hello world
```

Expected output:

```
0
```

```python
str = input()
count = 0
for i in range(len(str)):
    if str
