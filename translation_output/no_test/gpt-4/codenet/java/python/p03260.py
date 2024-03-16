Here is the translated code in Python:

```python
def main():
    n = int(input())
    k = int(input())
    if (n * k) % 2 == 1:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

Please note that in Python, we don't need to import any special modules like `Scanner` for basic input operations, as we have built-in functions like `input()` that can be used for taking input from the standard input (usually, the keyboard) and `print()` for output. The exception handling for input/output is also not explicitly required in such simple cases.
