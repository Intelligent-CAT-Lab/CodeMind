Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input()) * int(input())
    b = int(input()) * int(input())
    print((a < b) and b or a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, multiplies them, and then prints the larger of the two products. The `and` operator is used to check if `a` is less than `b`, and if it is, it prints `b`; otherwise, it prints `a`. The `or` operator is used to check if `a` is not less than `b`, and if it is, it prints `a`; otherwise, it prints `b`.
