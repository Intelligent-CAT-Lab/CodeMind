Here's the given Java code translated into Python:

```python
def main():
    k = 360
    j = 1

    try:
        i = int(input("Enter an integer: "))

        if 1 <= i <= 179:
            while (i * j) % k != 0:
                j += 1
            print(j)
        else:
            print("Please enter an angle to rotate between 1 ~ 179 degrees.")
    except ValueError:
        print("Please enter a valid integer.")

if __name__ == "__main__":
    main()
```

I included basic input handling with a `try` and `except` block to ensure that the user inputs a valid integer and catch a `ValueError` if parsing fails. Also, I wrapped the core code inside a `main` function and a standard Python idiom to denote the entry point of the script: `if __name__ == "__main__":`. 

Please note that I replaced the error messages with English equivalents, but you can replace these with appropriate messages in your preferred language.
