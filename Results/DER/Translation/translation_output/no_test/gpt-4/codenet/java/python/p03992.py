Below is the equivalent Python code. In Python, you don't need explicit buffering, and string manipulation is typically more straightforward. This example uses Python's built-in `input()` function to read from standard input and the standard `print()` function for output. The loop is simplified by using string slicing and concatenation.

```python
def main():
    X = input()
    sb = ""
    for i in range(len(X)):
        if i == 4:
            sb += " " + X[i]
        else:
            sb += X[i]
    
    print(sb)

if __name__ == "__main__":
    main()
```

The Python `+=` operator is used to append characters to the `sb` string. Since strings are immutable in Python, each `+=` operation creates a new string, but for such a small example, performance impact is negligible. If performance were critical and the string large, you might alternatively use a `list` and then `join` it to create the result.
