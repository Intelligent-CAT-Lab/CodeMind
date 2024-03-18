Below is the translated Python code from the provided Java code snippet:

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

def main():
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

# The following global variable `ans` is used to store intermediate return values
ans = 0

# Run the main function if the script is executed
if __name__ == "__main__":
    main()
```

Note that the translated Python code replaces Java's `System.in` and `System.out` with Python's `input()` and `print()` functions for handling I/O. The Java `Scanner` class is replaced with `map()` and `input().split()` for reading multiple values from a single input line in Python.

Additionally, the global variable `ans` must be declared as such before its usage in the `binary_search` function to avoid a `UnboundLocalError`. Python needs explicit declaration of global variables within functions when those variables are going to be modified.

The `BufferedReader` and `PrintWriter` in the Java code are not needed in the Python code as it uses its built-in I/O methods for simplicity and readability. Additionally, the `import` statements and the `main` class declaration are not required in Python.

This Python script takes three long integers as input from the standard input and prints the result expected by the provided test case.
