Here is the Python equivalent of the Java code:

```python
import math

def main():
    n1 = int(input())
    n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
    ans = n1 - (((n + 1) * n) / 2)
    print(ans if ans != 0 else n)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the value of `n` using the same formula as in the Java code, calculates the value of `ans`, and then prints the value of `ans` if it's not zero, or `n` otherwise.
