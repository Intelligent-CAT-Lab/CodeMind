Here's how the Java code snippet would translate to Python:

```python
def main():
    x = []
    sum = 0
    for i in range(5):
        number = int(input())
        x.append(number)
        sum += number
    print(15 - sum)

if __name__ == "__main__":
    main()
```

In this Python code, we do not need to import any special modules for basic input/output operations, as they are built into Python. The `input()` function is used to read input from the user, which is then converted into an `int` and added to the list `x`. The sum of all numbers is subtracted from 15 and the result is printed to the console.
