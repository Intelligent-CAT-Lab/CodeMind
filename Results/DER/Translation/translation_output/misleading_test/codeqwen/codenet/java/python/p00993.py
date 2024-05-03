Here is the Python equivalent of the Java code:

```python
import sys

def main():
    fact = 1
    mul = 1

    for i in range(1, 1511):
        fact *= mul
        mul += 1

    fact += 2

    for line in sys.stdin:
        n = int(line)
        print(fact)

        for i in range(2, 2 + n):
            print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It calculates the factorial of 1510 and adds 2 to it. Then it reads integers from the standard input and prints the factorial and the sequence of integers from 2 to 2 + n. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
