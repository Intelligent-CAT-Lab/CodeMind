Below is the Python equivalent of the provided Java code:

```python
def main():
    a = int(input())
    b = int(input())
    c = int(input())
    amount = 0
    time = a

    i = 2
    while time <= c + 0.5:
        amount += b
        time = a * i
        i += 1
    
    print(amount)

if __name__ == "__main__":
    main()
```

This Python code uses standard input to capture the three integer values and a while loop to perform the same logic as the original for loop in the Java code. In Python, a main function is defined for code organization, resembling the `main` method in Java, but this is not strictly necessary. The `if __name__ == "__main__":` check ensures that `main()` is called only when the script is executed directly and not when imported as a module.
