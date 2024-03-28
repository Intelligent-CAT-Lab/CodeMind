Below is the Python translation of the provided Java code:

```python
def main():
    n = int(input())

    # Initialize answer to zero
    ans = 0
    
    # 25cent
    ans += n // 25
    n %= 25
    
    # 10cent
    ans += n // 10
    n %= 10
    
    # 5cent
    ans += n // 5
    n %= 5
    
    # 1cent
    ans += n

    # Output the result
    print(ans)
    
if __name__ == "__main__":
    main()
```

Note that in Python, reading the input and converting it to an integer is much simpler (just use `int(input())`), and integer division and modulo operations can be performed using `//` and `%`, respectively, just like in Java. The `print` function is used to output the result. No additional boilerplate (like in Java with PrintWriter and InputStream) is necessary for these basic operations in Python.
