Here is the Python equivalent of the Java code:

```python
def main():
    # Get input
    a = int(input())

    # Calculate reverse
    a100 = a // 100
    a10 = (a // 10) % 10
    a1 = a % 10
    rev = a1 * 100 + a10 * 10 + a100

    # Check if the number is a palindrome
    if a == rev:
        ans = "Yes"
    else:
        ans = "No"

    # Print the result
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the user, calculates its reverse, and then checks if the original number is the same as its reverse. If it is, the program prints "Yes"; otherwise, it prints "No".
