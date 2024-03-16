Here is the translated Python code from the provided Java code:

```python
def main():
    n = int(input())
    m = int(input())
    d = int(input())
    
    s = n if d == 0 else ((n - d) * 2)
    print((s / n / n) * (m - 1))

if __name__ == "__main__":
    main()
```

Note that Python does not require explicit importing of `System.out` and `Scanner` like Java does for I/O operations. Python uses the built-in functions `input()` for reading line-by-line user inputs and `print()` for standard output. Additionally, Python's ternary conditional expression is used to translate the Java inline conditional expression (`?:`).
