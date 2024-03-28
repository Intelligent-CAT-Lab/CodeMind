
```
class FastScanner:
    def __init__(self):
        self.st = ''
        self.br = input()

    def next(self):
        while not self.st:
            self.st = self.br.split()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextInt())
        return a

    def nextLong(self):
        return long(self.next())

fs = FastScanner()
x = fs.nextInt()
if x >= 30:
    print("Yes")
else:
    print("No")
```
/content/posts/2020-04-20-python-list-comprehension.md
---
title: "Python List Comprehension"
date: 2020-04-20T15:00:00+09:00
draft: false
categories: ["Python"]
tags: ["Python"]
---

# List Comprehension

## List Comprehension

```python
a = [1, 2, 3, 4, 5]
b = [i * 2 for i in a]
print(b)
```

```
[2, 4, 6, 8, 10]
```

## List Comprehension with if

```python
a = [1, 2, 3, 4, 5]
b = [i * 2 for i in a if i % 2 == 1]
print(b)
```

```
[2, 6, 10]
```

## List Comprehension with if else

```python
a = [1, 2, 3, 4, 5]
b = [i * 2 if i % 2 == 1 else i * 3 for i in a]
print(b)
```

```
[2, 6, 6, 12, 15]
```

## List Comprehension with nested for

```python
a = [1, 2, 3, 4, 5]
b = [i * j for i in a for j in a]
print(b)
```

```
[1, 2, 3, 4, 5, 2, 4, 6, 8, 10, 3, 6, 9, 12, 15, 4, 8, 12, 16, 20, 5, 10, 15, 20, 25]
```

## List Comprehension with nested for and if

```python
a = [1, 2, 3, 4, 5]
b = [i * j for i in a for j in a if i % 2 == 1]
print(b)
```

```
[1, 3, 5, 3, 9, 15, 5, 15, 25]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a]
print(b)
```

```
[1, 4, 3, 8, 5, 12, 7, 16, 9, 20, 11, 24, 13, 28, 15, 32, 17, 36, 19, 40, 21, 44, 23, 48, 25, 52]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a if i % 2 == 1]
print(b)
```

```
[1, 3, 5, 3, 9, 15, 5, 15, 25]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a if i % 2 == 1 and j % 2 == 1]
print(b)
```

```
[1, 3, 5, 3, 9, 15, 5, 15, 25]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a if i % 2 == 1 and j % 2 == 0]
print(b)
```

```
[2, 6, 10, 4, 12, 20, 6, 18, 30]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a if i % 2 == 0 and j % 2 == 1]
print(b)
```

```
[2, 4, 6, 4, 8, 12, 6, 12, 20]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a if i % 2 == 0 and j % 2 == 0]
print(b)
```

```
[4, 8, 12, 8, 16, 24, 12, 24, 36]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a if i % 2 == 0 and j % 2 == 0 and i == j]
print(b)
```

```
[4, 8, 12, 8, 16, 24]
```

## List Comprehension with nested for and if else

```python
a = [1, 2, 3, 4, 5]
b = [i * j if i % 2 == 1 else i + j for i in a for j in a if i % 2 == 0 and j % 2 == 0 and i != j]
print(b)
```

```
[12, 24, 
