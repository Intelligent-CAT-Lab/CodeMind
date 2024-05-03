Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())

    n1 = n % 10
    n10 = (n - n1) % 100 // 10
    n100 = (n - n1 - n10 * 10) % 1000 // 100
    n1000 = n // 1000

    if (n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then calculates the last digit, the second last digit, the third last digit, and the first digit of the number. It then checks if any of these digits are the same. If they are, it prints "Yes", otherwise it prints "No".
