Below is the equivalent Python code for the provided Java snippet:

```python
def calc(num):
    n = float(num)
    sum_val = 0
    while num != 0:
        sum_val += num % 10
        num //= 10
    return n / sum_val

K = int(input())
num = 0
d = 1
for i in range(K):
    num += d
    if calc(num + 2 * d) < calc(num + d):
        d *= 10
    print(num)
```

You can use the following test input in Python to check the code:

```python
# Test input
K = 10

# Expected output:
# 1
# 2
# 3
# 4
# 5
# 6
# 7
# 8
# 9
# 19

for i in range(K):
    num += d
    if calc(num + 2 * d) < calc(num + d):
        d *= 10
    print(num)
```

Just enter the desired value for `K` and run the Python code to see the expected output.
