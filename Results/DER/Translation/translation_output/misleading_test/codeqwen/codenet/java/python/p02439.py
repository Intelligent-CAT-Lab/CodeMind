Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())
    min_val = min(a, b)
    max_val = max(a, b)
    print(min(min_val, c), max(max_val, c))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the minimum and maximum of these integers, and then prints the minimum and maximum of the minimum and maximum values. The `map` function is used to convert the input string into a list of integers, and the `input().split()` function is used to split the input string into a list of words, which are then converted into integers. The `min` and `max` functions are used to find the minimum and maximum values in the list of integers, respectively. The `print` function is used to print the minimum and maximum values of the minimum and maximum values.
