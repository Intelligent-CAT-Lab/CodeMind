Below is the translated Python code enclosed within ```python```:

```python
def main():
    # Input
    a = int(input())

    a100 = a // 100
    a10 = (a // 10) - (a100 * 10)
    a1 = a - (a100 * 100) - (a10 * 10)
    rev = (a1 * 100) + (a10 * 10) + a100
    
    if a == rev:
        ans = "Yes"
    else:
        ans = "No"
        
    # Output
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code has the same logical flow as the provided Java code, where it reads an integer from the user, breaks it down into its hundreds, tens, and ones place, reverses these digits, and checks if the original number is equal to this reversed number. The result ("Yes" or "No") is printed to the console.
