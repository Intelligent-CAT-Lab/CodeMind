Below is the translated Python code equivalent to the provided Java code. You can use this Python code to get the same functionality as the original Java version.

```python
N = int(input())

X = N
fx = 0

while N >= 10:
    fx += N % 10
    N //= 10

fx += N

if X % fx == 0:
    print("Yes")
else:
    print("No")
```

You can run the above Python code with the test input '12', and the expected output would be 'Yes':

Test input:
```
12
```

Expected output:
```
Yes
```
