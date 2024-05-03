Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    limit7 = N // 7
    check = False
    for i in range(limit7 + 1):
        left = N - (i * 7)
        if left % 4 == 0:
            check = True
    if check:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the limit for the loop, and then checks if there is a combination of 7s and 4s that add up to the input number. If such a combination exists, it prints "Yes", otherwise it prints "No".
