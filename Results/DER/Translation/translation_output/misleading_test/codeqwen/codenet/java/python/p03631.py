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

    # Determine if it's a palindrome
    ans = "Yes" if a == rev else "No"

    # Print result
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the user, calculates its reverse, and then determines if the original number is a palindrome (i.e., if it's the same as its reverse). It then prints out "Yes" if the number is a palindrome and "No" otherwise.
