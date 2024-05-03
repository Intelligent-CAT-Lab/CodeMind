Here is the Python equivalent of the Java code:

```python
def main():
    i = int(input())
    k = 360
    j = 1

    if 1 <= i <= 179:
        while (i * j) % k != 0:
            j += 1
        print(j)
    else:
        print("Invalid input. Please enter a number between 1 and 179.")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, checks if it's within the valid range, and then calculates the smallest integer `j` such that `i * j` is divisible by `k`. If the input is not within the valid range, it prints an error message.
