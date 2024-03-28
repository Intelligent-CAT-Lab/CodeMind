Below is the Python equivalent of the Java code provided:

```python
def p01722():
    n = int(input())
    match n:
        case 0:
            print(1)
        case 1:
            print(2)
        case 2:
            print(1)
        case _:
            print(0)

# Test case:
p01722()
```

Note that in Python 3.10 and later, you can use the `match` statement, which is similar to the `switch` statement in Java. If you're using a version of Python older than 3.10, you would use an if-elif-else structure, like this:

```python
def p01722():
    n = int(input())
    if n == 0:
        print(1)
    elif n == 1:
        print(2)
    elif n == 2:
        print(1)
    else:
        print(0)

# Test case:
p01722()
```
