Here's the translated Java code into Python:

```python
# We don't need to import anything for basic input/output

def main():
    r = int(input()) * 100
    g = int(input()) * 10
    b = int(input())
    
    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")

# Call the main function
if __name__ == "__main__":
    main()
```

The above Python code reads three integers from the standard input (like the Java version reads from `Scanner`), performs the same calculations, and prints "YES" or "NO" depending on whether the sum is divisible by 4.
