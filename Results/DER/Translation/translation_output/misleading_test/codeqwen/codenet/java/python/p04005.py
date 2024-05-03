Here is the Python equivalent of the Java code:

```python
def main():
    A, B, C = map(int, input().split())
    array = sorted([A, B, C])
    if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
        print(0)
    else:
        print(array[0] * array[1])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, sorts them, and then checks if any of them are even. If they are, it prints 0. If not, it prints the product of the two smallest odd numbers.
