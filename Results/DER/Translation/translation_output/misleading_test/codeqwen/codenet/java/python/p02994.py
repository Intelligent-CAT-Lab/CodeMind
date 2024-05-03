Here is the Python equivalent of the Java code:

```python
def main():
    n, l = map(int, input().split())

    diff = []
    
    for i in range(1, n+1):
        value = l+i-1
        if value < 0:
            value = value * -1
        diff.append(value)
        
    remove_k = diff.index(min(diff)) + 1
    
    print(n*l + n*(n+1)//2 - n - (l+ remove_k -1))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the difference between the given integer and all integers from 1 to n, finds the minimum difference, and then prints the result.
