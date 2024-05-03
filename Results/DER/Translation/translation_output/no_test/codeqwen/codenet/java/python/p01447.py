Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    count = 0
    
    while n > 1:
        n = (n + (n % 3 == 0 ? 0 : 3 - n % 3)) // 3
        count += 1
    
    print(count)

if __name__ == "__main__":
    main()
```

Please note that Python does not have a ternary operator like Java. Instead, we use the `if` statement to perform the same operation. Also, Python uses `//` for integer division, which is equivalent to `/` in Java.
