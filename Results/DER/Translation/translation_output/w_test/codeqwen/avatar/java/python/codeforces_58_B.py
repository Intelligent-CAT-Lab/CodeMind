Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    print(n, end=" ")
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i, end=" ")
            m = i

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, prints it, then prints all the factors of the number in descending order. The `end=" "` argument in the `print` function is used to print all the factors on the same line separated by spaces. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
