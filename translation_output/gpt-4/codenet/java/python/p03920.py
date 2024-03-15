Here's the translated code from Java to Python:

```python
def read_int():
    return int(input())

N = read_int()
while N > 0:
    sum = 0
    for i in range(1, N+1):
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break
```
