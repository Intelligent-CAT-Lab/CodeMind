Here is the Python version of the given Java code:

```python
x = int(input())

if 400 <= x and x < 600:
    k = 8
elif 600 <= x and x < 800:
    k = 7
elif 800 <= x and x < 1000:
    k = 6
elif 1000 <= x and x < 1200:
    k = 5
elif 1200 <= x and x < 1400:
    k = 4
elif 1400 <= x and x < 1600:
    k = 3
elif 1600 <= x and x < 1800:
    k = 2
elif 1800 <= x and x <= 1999:
    k = 1
else:
    k = 0

print(k)
```

To use this code, simply run it and input an integer when prompted. Here's a sample usage for test input `725`:

Test input:
```
725
```

Expected output:
```
7
```
