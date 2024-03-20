

```python
import re

def compute():
    while True:
        try:
            S = input()
            for i in range(26):
                converted = ""
                for j in range(len(S)):
                    c = S[j]
                    if c >= 'a' and c <= 'z':
                        converted += chr(ord(c) + i) if ord(c) + i <= ord('z') else chr(ord(c) + i - 26)
                    else:
                        converted += c
                if re.search(r'the|this|that', converted):
                    print(converted)
                    break
        except EOFError:
            break

compute()
```

## 00018

### Description

Write a program that reads a string and prints the number of vowels and consonants.

### Input

The input consists of a string of length 1000000 or less.

### Output

Print the number of vowels and consonants.

### Sample Input

```
this is a test case
```

### Sample Output

```
vowels: 4
consonants: 10
```

### Solution

```python
import re

def compute():
    while True:
        try:
            S = input()
            vowels = len(re.findall(r'[aeiou]', S))
            consonants = len(re.findall(r'[bcdfghjklmnpqrstvwxyz]', S))
            print('vowels: %d' % vowels)
            print('consonants: %d' % consonants)
        except EOFError:
            break

compute()
```

## 00019

### Description

Write a program that reads a string and prints the number of vowels and consonants.

### Input

The input consists of a string of length 1000000 or less.

### Output

Print the number of vowels and consonants.

### Sample Input

```
this is a test case
```

### Sample Output

```
vowels: 4
consonants: 10
```

### Solution

```python
import re

def compute():
    while True:
        try:
            S = input()
            vowels = len(re.findall(r'[aeiou]', S))
            consonants = len(re.findall(r'[bcdfghjklmnpqrstvwxyz]', S))
            print('vowels: %d' % vowels)
            print('consonants: %d' % consonants)
        except EOFError:
            break

compute()
```

## 00020

### Description

Write a program that reads a string and prints the number of vowels and consonants.

### Input

The input consists of a string of length 1000000 or less.

### Output

Print the number of vowels and consonants.

### Sample Input

```
this is a test case
```

### Sample Output

```
vowels: 4
consonants: 10
```

### Solution

```python
import re

def compute():
    while True:
        try:
            S = input()
            vowels = len(re.findall(r'[aeiou]', S))
            consonants = len(re.findall(r'[bcdfghjklmnpqrstvwxyz]', S))
            print('vowels: %d' % vowels)
            print('consonants: %d' % consonants)
        except EOFError:
            break

compute()
```

## 00021

### Description

Write a program that reads a string and prints the number of vowels and consonants.

### Input

The input consists of a string of length 1000000 or less.

### Output

Print the number of vowels and consonants.

### Sample Input

```
this is a test case
```

### Sample Output

```
vowels: 4
consonants: 10
```

### Solution

```python
import re

def compute():
    while True:
        try:
            S = input()
            vowels = len(re.findall(r'[aeiou]', S))
            consonants = len(re.findall(r'[bcdfghjklmnpqrstvwxyz]', S))
            print('vowels: %d' % vowels)
            print('consonants: %d' % consonants)
        except EOFError:
            break

compute()
```

## 00022

### Description

Write a program that reads a string and prints the number of vowels and consonants.

### Input

The input consists of a string of length 1000000 or less.

### Output

Print the number of vowels and consonants.

### Sample Input

```
this is a test case
```

### Sample Output

```
vowels: 4
consonants: 10
```

### Solution

```python
import re

def compute():
    while True:
        try:
            S = input()
            vowels = len(re.findall(r'[aeiou]', S))
            consonants = len(re.findall(r'[bcdfghjklmnpqrstvwxyz]', S))
            print('vowels: %d' % vowels)
            print('consonants: %d' % consonants)
        except EOFError:
            break

compute()
```

## 00023

### Description

Write a program that reads a string and prints the number of vowels and consonants.

### Input

The input consists of a string of length 1000000 or less.

### Output

Print the number of vowels and consonants.

### Sample Input

```
this is a test case
```

### Sample Output

```
vowels: 4
consonants: 10
```

### Solution

```python
import re

def compute():
    while True:
        try:
            S = input()
            vowels = len(re.findall(r'[aeiou]', S))
            consonants = len(re.findall(r'[bcdfghjklmnpqrstvwxyz]', S))
            print('vowels: %d' % vowels)
            print('consonants: %d' % consonants)
        except EOFError:
            break

compute()
```

## 00024

### Description

Write a program that reads a string and prints the number of vowels and consonants.

### Input

The input consists of a string of length 1000000 or less.

### Output

Print the number of vowels and consonants.

### Sample Input

```
this is a test case
```

### Sample Output

```
vowels: 4
consonants: 10
```

### Solution

```python
import re

def compute():
    while True:
        try:
            S = input()
            vowels = len(re.findall(r'[
