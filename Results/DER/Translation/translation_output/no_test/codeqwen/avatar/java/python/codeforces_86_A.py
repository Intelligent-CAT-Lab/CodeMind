Here is the Python equivalent of the Java code:

```python
def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    maxx = 0
    for j in range(pow):
        maxx = maxx * 10 + 9
    return a * (maxx - a)

if __name__ == "__main__":
    l = int(input())
    r = int(input())
    res = 0
    maxxes = [0] * 10
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        maxxes[i] = temp // 2 * (temp - temp // 2)
    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        if l <= temp // 2 and temp // 2 <= r:
            res = max(maxxes[i], res)
    print(res)
```

Please note that the Python code assumes that the input is provided as command line arguments. If you want to read the input from a file, you can modify the code accordingly.
