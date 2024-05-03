Here is the Python equivalent of the Java code:

```python
def run():
    n = int(input())
    for i in range(n):
        if is_palin(str(n-i)):
            print(n-i)
            break
        if is_palin(str(n+i)):
            print(n+i)
            break

def is_palin(s):
    return s == s[::-1]

if __name__ == "__main__":
    run()
```

This Python code does the same thing as the Java code: it finds the closest palindrome to the input number by checking both the number and its complement. The `is_palin` function checks if a string is a palindrome by comparing it to its reverse. The `run` function does the main work of finding the closest palindrome.
