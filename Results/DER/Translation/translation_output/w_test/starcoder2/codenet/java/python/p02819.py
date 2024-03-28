

```python
x = int(input())

while not prime(x):
    x += 1

print(x)

def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True
```
/p02819.py
x = int(input())

while not prime(x):
    x += 1

print(x)

def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

