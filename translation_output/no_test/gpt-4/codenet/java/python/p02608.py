Sure, here is the Python version of the provided Java code:

```python
# You don't need an import statement to use input in Python

def main():
    n = int(input())
    eratosu = [0] * 100000
    for i in range(1, 101):
        for j in range(1, 101):
            for k in range(1, 101):
                if i * i + j * j + k * k >= 100000:
                    continue
                result = i * i + j * j + k * k + i * j + j * k + k * i
                eratosu[result] += 1
    
    # Using join for building final string output in Python
    print('\n'.join(str(eratosu[i]) for i in range(1, n+1)))

if __name__ == '__main__':
    main()
```

In Python, the `input()` function is used to capture user input from the standard input. The loop ranges use `range()` which, unlike Java for-loops, must be given the `start`, `stop`, and an optional `step` where `stop` is exclusive, so `range(1, 101)` in Python is equivalent to `1 <= i <= 100` in Java. Also, list indexing starts from 0 in Python, which is taken care of in the code conversion. Additionally, strings can be joined using `join()`, which is an efficient way to build a string from a list of strings. The if `__name__ == '__main__':` statement is used to ensure that the `main()` function is run only when the script is executed as the main program, not when it is imported as a module in another script.
