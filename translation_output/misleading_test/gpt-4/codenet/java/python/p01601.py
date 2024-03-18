Here's the translation of the given Java code to Python:

```python
def is_palin(s):
    for i in range(len(s) // 2):
        if s[i] != s[len(s) - i - 1]:
            return False
    return True

def nearest_palindrome(n):
    i = 0
    while True:
        if is_palin(str(n - i)):
            return n - i
        if is_palin(str(n + i)):
            return n + i
        i += 1

# Test input
test_input = 13

# Expected output: -63
output = nearest_palindrome(test_input)
print(output)
```

This Python script will give you the same functionality as the Java code. The script defines two functions, `is_palin`, which checks if a string is a palindrome, and `nearest_palindrome`, which finds the nearest number that is a palindrome to the given integer. It then tests the function using the provided test_input.
