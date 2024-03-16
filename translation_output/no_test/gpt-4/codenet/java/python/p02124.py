Here's the equivalent Python code for the provided Java code:

```python
# There's no direct import needed for using input functionality in Python

def main():
    ans = "ai1333"
    x = int(input())
    for i in range(x // 100):
        ans += "3"
    print(ans)

if __name__ == '__main__':
    main()
```

This Python code will behave the same way as the original Java program, reading an integer from standard input and appending additional "3" characters to the initial string based on the input value divided by 100.
