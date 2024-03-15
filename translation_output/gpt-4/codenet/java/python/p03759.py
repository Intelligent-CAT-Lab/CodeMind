Here is the equivalent Python code for the provided Java code:

```python
# No need to import a Scanner in Python; input() function is used

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if a - b == b - c:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In Python, input is read from the console using the `input()` function, which reads a line as a string. If you expect an integer, you must explicitly convert the result of `input()` to an int using the `int()` function. There's no need for a class or a Scanner object in Python for this simple task. The `if __name__ == "__main__":` part ensures that `main()` is called only when the script is run directly, not when imported as a module.
