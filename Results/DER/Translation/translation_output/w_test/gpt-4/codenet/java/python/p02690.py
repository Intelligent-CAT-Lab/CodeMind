Here is the Python version of the provided Java code. Note that Python does not have an explicit `FastScanner` utility like the one used in Java, so we can simply use Python's built-in input function to read the user's input. Also, Python dictionaries inherently serve as hash maps, so we'll use a dictionary instead of a `HashMap`.

```python
def pow(base, n):
    ret_val = 1
    while n > 0:
        if n & 1:
            ret_val *= base
        n >>= 1
        base *= base
    return ret_val

def solve(x):
    pow_map = {0: 0, 1: 1}
    
    before_pow = 1
    base = 2
    while True:
        pow_val = pow(base, 5)
        pow_map[pow_val] = base
        if pow_val - before_pow > x:
            break
        base += 1
        before_pow = pow_val

    for pow_val, base in pow_map.items():
        diff = abs(x - pow_val)
        if diff in pow_map:
            print(pow_map[pow_val], end=' ')
            if pow_val - x < 0:
                print(-pow_map[diff])
            else:
                print(pow_map[diff])
            return

if __name__ == '__main__':
    x = int(input())
    solve(x)
```

This code defines a `solve` function that takes an integer `x` and performs the same logic as the Java version. It replaces the utility class `FastScanner` with direct usage of `input()` for simplicity, assuming the input is always in the correct format.

A sample test case based on the input provided:

Run the script and input 33 to see the expected output.

```shell
python script.py
33
```

Expected output:

```shell
2 -1
```
