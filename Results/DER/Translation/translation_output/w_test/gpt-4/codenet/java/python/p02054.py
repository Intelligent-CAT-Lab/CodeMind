Certainly! Here's the translation of the provided Java code to Python:

```python
def main():
    # Reading the input as integers
    nums = map(int, input().split())
    # Calculating the number of odd numbers
    odd = sum(x % 2 for x in nums)
    # Printing the result based on the number of odd numbers
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```

The Python code does the following:

1. It defines a `main` function that contains the logic of the program.
2. It reads a line of input, splits it into parts, and converts those parts to integers.
3. It sums the count of odd numbers present in the input.
4. It then prints "Hom" if there are two or more odd numbers; otherwise, it prints "Tem".
5. The `if __name__ == "__main__":` block ensures that `main()` is called when the script is run directly.
