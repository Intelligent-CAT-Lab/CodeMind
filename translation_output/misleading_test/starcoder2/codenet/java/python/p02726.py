

```python
n, x, y = map(int, input().split())
edges = [0] * n
for i in range(n):
    for j in range(i+1, n):
        edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))+1)
        edges[edge] += 1
for i in range(1, n):
    print(edges[i])
```

## Problem 3

### Problem 3.1

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_list(l):
    return sum(l)
```

### Problem 3.2

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max_list(l):
    return max(l)
```

### Problem 3.3

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min_list(l):
    return min(l)
```

### Problem 3.4

Write a function that takes a list of numbers and returns the average of the numbers.

```python
def avg_list(l):
    return sum(l) / len(l)
```

### Problem 3.5

Write a function that takes a list of numbers and returns the median of the numbers.

```python
def median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        return (l[len(l)//2] + l[len(l)//2-1]) / 2
    else:
        return l[len(l)//2]
```

### Problem 3.6

Write a function that takes a list of numbers and returns the mode of the numbers.

```python
def mode_list(l):
    d = {}
    for i in l:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1
    max_count = 0
    max_num = 0
    for i in d:
        if d[i] > max_count:
            max_count = d[i]
            max_num = i
    return max_num
```

### Problem 3.7

Write a function that takes a list of numbers and returns the range of the numbers.

```python
def range_list(l):
    return max(l) - min(l)
```

### Problem 3.8

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```python
def std_list(l):
    avg = sum(l) / len(l)
    return (sum([(i-avg)**2 for i in l]) / len(l))**0.5
```

### Problem 3.9

Write a function that takes a list of numbers and returns the variance of the numbers.

```python
def var_list(l):
    avg = sum(l) / len(l)
    return sum([(i-avg)**2 for i in l]) / len(l)
```

### Problem 3.10

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.11

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.12

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.13

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.14

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.15

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.16

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.17

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.18

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```python
def mad_list(l):
    avg = sum(l) / len(l)
    return sum([abs(i-avg) for i in l]) / len(l)
```

### Problem 3.19

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

