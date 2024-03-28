Certainly! The Java code can be translated into Python as follows:

```python
# No import statement is necessary because Python has built-in functions for input.

def main():
    n = float(input())  # Reading input as float, equivalent to Java's nextDouble()

    odd = 0
    not_odd = 0
    for i in range(1, int(n) + 1):  # range in Python is not inclusive, so add 1 to n
        if i % 2 == 0:
            not_odd += 1
        else:
            odd += 1
    
    print(odd / n)

if __name__ == "__main__":
    main()
```

Please note that, unlike Java's `Scanner.nextDouble()` which reads a double value from the input, in Python we use `input()` to read input from the console as a string, and `float()` to convert that string into a floating-point number, which is equivalent to a double in Java.

When you want to run the code, just call the `main()` function, and Python will execute the script similar to how the Java main method would run.
