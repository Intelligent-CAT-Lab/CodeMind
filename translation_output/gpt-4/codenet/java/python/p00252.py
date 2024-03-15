The equivalent Python code is:

```python
def main():
    a = [int(input()) for _ in range(3)]
    
    if a[0] == 1 and a[1] == 1:
        print("Open")
    elif a[2] == 1:
        print("Open")
    else:
        print("Close")

if __name__ == "__main__":
    main()
```

Note that in Python, we don't need to import a Scanner class for basic input operations. We use the built-in `input()` function to get user input from the console. The list comprehension is used to read three integers from input and store them in the list `a`.
