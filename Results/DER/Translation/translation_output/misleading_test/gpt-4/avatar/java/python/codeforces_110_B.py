Here is the Python version of the provided Java code:

```python
n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print('ab')
elif n == 3:
    print('abc')
else:
    for i in range(n // 4):
        print('abcd', end='')
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print('ab')
    elif t == 3:
        print('abc')
```

Now using the test input:

```python
print("Test input:")
print(100)

print("Expected output:")
n = 100
if n == 1:
    print('a')
elif n == 2:
    print('ab')
elif n == 3:
    print('abc')
else:
    for i in range(n // 4):
        print('abcd', end='')
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print('ab')
    elif t == 3:
        print('abc')
```

The expected output for the test input of 100 would be the string `'abcd'` repeated 25 times.
