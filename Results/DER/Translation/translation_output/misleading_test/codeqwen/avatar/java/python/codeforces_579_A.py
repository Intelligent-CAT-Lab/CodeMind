Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    s = " "
    
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "
    
    ans = 0
    
    for i in range(len(s)):
        if s[i] == '1':
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, converts it to binary, counts the number of '1's in the binary representation, and prints the count.
