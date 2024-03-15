Here's the Java code translated to Python and enclosed within the ```python``` block as per your request:

```python
class P02606:
    def __init__(self):
        L = int(input())
        R = int(input())
        d = int(input())

        ans = 0
        for i in range(L, R + 1):
            if i % d == 0:
                ans += 1

        print(ans)

if __name__ == '__main__':
    P02606()
```

Please note that Python uses dynamic typing and does not require explicit import statements to use basic functions like `input()` and `print()`. Also, constructors in Python use the `__init__` method, and unlike Java, Python does not require semicolons at the end of lines. Classes and methods are defined using the `class` and `def` keywords.

