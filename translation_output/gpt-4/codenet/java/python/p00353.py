The equivalent Python code using the `input()` function for reading from standard input would look like this:

```python
def main():
    input_values = input().split(" ")
    m = int(input_values[0])
    f = int(input_values[1])
    b = int(input_values[2])

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()
```

Remember to call the `main()` function if the script is executed as the main program. The `if __name__ == "__main__":` portion ensures that the `main()` function is run when the script is not being imported as a module in another script but is executed directly.
