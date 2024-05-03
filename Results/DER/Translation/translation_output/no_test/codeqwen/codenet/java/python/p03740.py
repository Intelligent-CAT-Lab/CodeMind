Here is the Python equivalent of the Java code:

```python
try:
    sc = input()
    print("Brown" if abs(int(sc.split()[0]) - int(sc.split()[1])) <= 1 else "Alice")
except Exception as e:
    print(e)
```

This Python code does the same thing as the Java code. It reads two numbers from the user, calculates the absolute difference between them, and prints "Brown" if the difference is less than or equal to 1, and "Alice" otherwise. If an exception occurs during the execution of the code, it prints the exception message.
