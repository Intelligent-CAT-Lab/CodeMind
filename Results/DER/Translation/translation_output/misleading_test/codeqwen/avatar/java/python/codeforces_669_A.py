Here is the Python equivalent of the Java code:

```python
class codeforces_669_A:
    def codeforces_669_A(self):
        n = int(input())
        total = 0
        if n == 2:
            print(1)
            return
        while n > 0:
            n -= 1
            if n > 0:
                if n >= 2:
                    total += 1
                n -= 2
            total += 1
        print(total)

codeforces_669_A().codeforces_669_A()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the total number of operations needed to reduce the number to 1, and then prints the result.
