Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    if a == 1:
        if b != 1:
            print("Alice")
    elif b == 1:
        if a != 1:
            print("Bob")
    elif a > b:
        print("Alice")
    elif a < b:
        print("Bob")
    else:
        print("Draw")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, and then checks if they are equal, or if one is greater than the other. If they are not equal, it prints out "Alice" or "Bob" depending on which one is greater. If they are equal, it prints out "Draw".
