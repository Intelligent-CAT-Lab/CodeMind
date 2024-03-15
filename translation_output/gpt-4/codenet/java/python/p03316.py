Here is the equivalent Python code for the Java program you provided:

```python
def sum_digits(n):
    # Calculate the sum of each digit of a natural number
    sum = 0
    while n != 0:
        # Use %10 to get the rightmost digit
        sum += n % 10
        # Use n//=10 to remove the rightmost digit
        n //= 10
    return sum  # Return the total

def main():
    # Read an integer from input
    n = int(input())
    a = sum_digits(n)
    if n % a == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

I replaced the comments with English for clarity. In Python, there's no need to use a `Scanner` like in Java; you can simply use the built-in `input()` function instead. The comments appear to be in Japanese, and they describe what certain parts of the `sum_digits` function are doing: it uses a loop to add each digit of `n` to a sum, using the modulus and integer division operations to extract each digit.
