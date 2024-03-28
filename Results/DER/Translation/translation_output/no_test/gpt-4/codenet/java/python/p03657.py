Here is the translated Python code for the given Java code:

```python
# No need to import any specific module for input in Python

def main():
    a = int(input())
    b = int(input())
    if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
        print("Possible")
    else:
        print("Impossible")

if __name__ == "__main__":
    main()
```

This Python code performs the same logic as the original Java code, reading two integers from the standard input and checking if any of them or their sum is divisible by 3. It then outputs "Possible" or "Impossible" accordingly.
