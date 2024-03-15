Here is the equivalent code in Python:

```python
def problem102a(n):
    return n if n % 2 == 0 else n * 2

if __name__ == '__main__':
    n = int(input())
    print(problem102a(n))
```

This Python code performs the same logic as the Java code: reads an integer from standard input, passes it to the `problem102a` function which doubles it if it is not even, and then prints the result.
