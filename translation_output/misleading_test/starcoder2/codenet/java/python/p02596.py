

```python
import sys

def main():
    N = int(sys.stdin.readline())
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N
    i = l
    vis = [False] * N
    while True:
        if vis[m]:
            print(-1)
            break
        vis[m] = True
        if m == 0:
            print(i)
            break
        m = (10 * m + 7) % N
        i += 1

if __name__ == '__main__':
    main()
```

## Problem 3

### Problem 3.1

Write a function that takes a list of integers and returns the sum of the integers.

```python
def sum_list(l):
    return sum(l)
```

### Problem 3.2

Write a function that takes a list of integers and returns the largest integer in the list.

```python
def max_list(l):
    return max(l)
```

### Problem 3.3

Write a function that takes a list of integers and returns the smallest integer in the list.

```python
def min_list(l):
    return min(l)
```

### Problem 3.4

Write a function that takes a list of integers and returns the average of the integers.

```python
def avg_list(l):
    return sum(l) / len(l)
```

### Problem 3.5

Write a function that takes a list of integers and returns the median of the integers.

```python
def median_list(l):
    l.sort()
    if len(l) % 2 == 0:
        return (l[len(l) // 2] + l[len(l) // 2 - 1]) / 2
    else:
        return l[len(l) // 2]
```

### Problem 3.6

Write a function that takes a list of integers and returns the mode of the integers.

```python
def mode_list(l):
    d = {}
    for i in l:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1
    return max(d, key=d.get)
```

### Problem 3.7

Write a function that takes a list of integers and returns the standard deviation of the integers.

```python
def std_list(l):
    avg = sum(l) / len(l)
    return (sum([(i - avg) ** 2 for i in l]) / len(l)) ** 0.5
```

### Problem 3.8

Write a function that takes a list of integers and returns the variance of the integers.

```python
def var_list(l):
    avg = sum(l) / len(l)
    return sum([(i - avg) ** 2 for i in l]) / len(l)
```

### Problem 3.9

Write a function that takes a list of integers and returns the range of the integers.

```python
def range_list(l):
    return max(l) - min(l)
```

### Problem 3.10

Write a function that takes a list of integers and returns the number of even integers in the list.

```python
def even_list(l):
    return len([i for i in l if i % 2 == 0])
```

### Problem 3.11

Write a function that takes a list of integers and returns the number of odd integers in the list.

```python
def odd_list(l):
    return len([i for i in l if i % 2 == 1])
```

### Problem 3.12

Write a function that takes a list of integers and returns the number of positive integers in the list.

```python
def pos_list(l):
    return len([i for i in l if i > 0])
```

### Problem 3.13

Write a function that takes a list of integers and returns the number of negative integers in the list.

```python
def neg_list(l):
    return len([i for i in l if i < 0])
```

### Problem 3.14

Write a function that takes a list of integers and returns the number of integers that are divisible by 3 in the list.

```python
def div3_list(l):
    return len([i for i in l if i % 3 == 0])
```

### Problem 3.15

Write a function that takes a list of integers and returns the number of integers that are divisible by 5 in the list.

```python
def div5_list(l):
    return len([i for i in l if i % 5 == 0])
```

### Problem 3.16

Write a function that takes a list of integers and returns the number of integers that are divisible by 7 in the list.

```python
def div7_list(l):
    return len([i for i in l if i % 7 == 0])
```

### Problem 3.17

Write a function that takes a list of integers and returns the number of integers that are divisible by 11 in the list.

```python
def div11_list(l):
    return len([i for i in l if i % 11 == 0])
```

### Problem 3.18

Write a function that takes a list of integers and returns the number of integers that are divisible by 13 in the list.

```python
def div13_list(l):
    return len([i for i in l if i % 13 == 0])
```

### Problem 3.19

Write a function that takes a list of integers and returns the number of integers that are divisible by 17 in the list.

```python
def div17_list(l):
    return len([i for i in l if i % 17 == 0])
```

### Problem 3.20

Write a function that takes a list of integers and returns the number of integers that are divisible by 19 in the list.

```python
def div19_list(l):
    return len([i for i in l if i % 19 == 0])
```

### Problem 3.2
