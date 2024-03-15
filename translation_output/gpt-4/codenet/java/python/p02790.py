Here's the translated Python code:

```python
if __name__ == "__main__":
    a = int(input())
    b = int(input())

    if a >= b:
        for i in range(a):
            print(b, end='')
    else:
        for i in range(b):
            print(a, end='')
```

Note: In Python, `print` adds a newline character by default at the end of the output. To match the behavior of Java's `System.out.print`, you need to specify `end=''` to avoid the newline character.
