```python
import sys

def solver():
    n = nl()
    x = nl()
    sum_val = 0
    if x == n - x:
        sum_val = 3 * x
        print(sum_val)
        return
    else:
        if x > n - x:
            sum_val += x + n - x
            sum_val += calc(x, n - x, False)
        elif x < n - x:
            sum_val += x + n - x
            sum_val += calc(x, n - x, False)
        print(sum_val)
        return

def calc(x, y, first):
    sum_val = 0
    if x % y == 0:
        if first:
            sum_val += y
        sum_val += (x // y * 2 - 1) * y
        return sum_val
    else:
        if first:
            sum_val += y
        sum_val += (x // y * 2) * y
        sum_val += calc(y, x % y, False)
        return sum_val

def nl():
    num = 0
    minus = False
    while True:
        b = next_input()
        if (b == -1) or (b >= ord('0') and b <= ord('9')) or (b == ord('-')):
            break
    if b == ord('-'):
        num = 0
        minus = True
    else:
        num -= ord('0')

    while True:
        b = next_input()
        if b >= ord('0') and b <= ord('9'):
            num = num * 10 + (b - ord('0'))
        else:
            return -num if minus else num

def next_input():
    return next(read_values)

def read_values():
    while True:
        while not eof and (not (c := sys.stdin.read(1)).isdigit() and c != '-'):
            pass
        value = 0
        sign = -1 if c == '-' else 1
        if c != '-':
            value = ord(c) - ord('0')
        while (c := sys.stdin.read(1)).isdigit():
            value = value * 10 + (ord(c) - ord('0'))
        yield sign * value

def eof():
    return not sys.stdin.read(1)

if __name__ == '__main__':
    solver()
```
```
