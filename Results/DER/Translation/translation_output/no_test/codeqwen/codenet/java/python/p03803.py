Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input())
    b = int(input())
    if a == 1:
        if b != 1:
            print("Alice")
    elif b == 1:
        if a != 1:
            print("Bob")
    elif a > b and a != 1 and b != 1:
        print("Alice")
    elif a < b and a != 1 and b != 1:
        print("Bob")
    else:
        print("Draw")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if they are equal to 1, and if not, it checks if one is greater than the other. If neither condition is met, it prints "Draw".
