Here is the python equivalent of the Java code you provided:

```python
def main():
    w = int(input())
    h = int(input())
    x = int(input())
    y = int(input())
    ans = w * h / 2
    a = 0
    if x + x == w and y + y == h:
        a = 1
    print(f"{ans} {a}")

if __name__ == "__main__":
    main()
```

Note that in Python, indentation is used to define blocks of code instead of the braces `{}` as in Java. Also, Python has dynamic typing, so you don't need to declare the variable types explicitly. The division operator `/` always produces a float result, so there is no need to cast `w` and `h` to `double`.
