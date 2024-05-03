Here is the Python equivalent of the Java code:

```python
def main():
    N = input()

    for i in range(len(N)):
        c = N[i]
        if i % 2 == 0:
            if c == 'L':
                print("No")
                return
        else:
            if c == 'R':
                print("No")
                return
        if i == len(N) - 1:
            print("Yes")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is at an even index (0, 2, 4, ...), it checks if the character is 'L'. If it is, it prints "No" and returns from the function. If the character is at an odd index (1, 3, 5, ...), it checks if the character is 'R'. If it is, it prints "No" and returns from the function. If the character is at the last index, it prints "Yes". If none of these conditions are met, it continues to the next character.
