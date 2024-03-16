Below is the translated Java code to Python:

```python
def codeforces_92_A():
    n, k = map(int, input().split())
    i = 1
    req = 1

    while k - req >= 0:
        k -= req
        i += 1
        req = i % n if i % n != 0 else n

    print(k)

# Call the function if this is the main module
if __name__ == "__main__":
    codeforces_92_A()
```

Please note that in Python, we do not need to import a Scanner object as we do in Java. Instead, we use the `input()` function and the `map()` function to read and parse input from the user. Also, Python's `%` module operator directly gives the remainder of the division, unlike Java where `% n` could result in `0` and an additional condition must be set to avoid that. Additionally, there are no explicit type declarations in Python as there are in Java.
