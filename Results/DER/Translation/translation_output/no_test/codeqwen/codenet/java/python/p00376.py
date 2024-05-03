Here is the Python equivalent of the Java code:

```python
import math

def main():
    a = int(input())
    b = int(input())

    ans = math.fabs(a - b)

    print(int(ans))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `math.fabs()` function to calculate the absolute value of the difference between `a` and `b`. The `int()` function is used to convert the result to an integer before printing it. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
