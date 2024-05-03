Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())
    amount = 0
    time = a
    
    for i in range(2, c + 1):
        amount += b
        time = a * i
    
    print(amount)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the amount of money accumulated over time, and prints the result. The `map` function is used to convert the input string into a list of integers. The `input().split()` function is used to split the input string into a list of strings, which are then converted into integers using the `map` function. The `range` function is used to generate a sequence of integers from 2 to `c`, inclusive. The `for` loop iterates over this sequence, and for each iteration, it adds `b` to `amount` and updates `time` to be `a` times `i`. Finally, the `print` function is used to print the value of `amount`.
