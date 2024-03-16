The following Python code represents a translation of the given Java code:

```python
def get(a):
    ret = 0
    now = 1
    t = 1
    
    while True:
        if now * 10 > a:
            ret += (a - now + 1) * t
            break
        
        ret += now * 9 * t
        now *= 10
        t += 1
    
    return ret

def binary_search(k, l, r, x):
    global ans
    if r >= l:
        mid = l + (r - l) // 2
        
        if mid > ans and mid * k <= x:
            ans = mid
        
        if k * mid == x:
            return mid
        
        if k * mid > x:
            return binary_search(k, l, mid - 1, x)
        
        return binary_search(k, mid + 1, r, x)
    
    return -1

ans = 0

def main():
    global ans
    gen, st, tim = map(int, input().split())
    gen //= tim
    beg = st - 1
    end = 10**18
    
    while True:
        med = (beg + end) // 2 + 1
        
        if get(med) - get(st - 1) > gen:
            end = med - 1
        else:
            beg = med
        
        if beg == end:
            print(beg - st + 1)
            break

if __name__ == "__main__":
    main()
```

Please take note of the conversion from Java to Python:

- In Java, `long` data type is used which is converted to `int` in Python because Python's integer types can handle arbitrarily large values.
- The binary search is implemented as a recursive function in both Java and Python, maintaining the same logic.
- The use of global variable `ans` has been kept in Python, using the `global` keyword to modify its value inside the `binary_search` function.
- The `main` function implements the main logic of calculations which includes reading input, calculations, and printing the result.
- Reading input and printing output conforms to Python's syntax (`input()` and `print()` functions). In this case, the query is read from `stdin` using `input().split()`, assuming that the input is being provided on the command line.
- The operation `x / y` in Java (integer division) is represented in Python with `x // y` to ensure an integer division result.
- Removed Java-specific imports and boilerplate code as they are not necessary in Python.
