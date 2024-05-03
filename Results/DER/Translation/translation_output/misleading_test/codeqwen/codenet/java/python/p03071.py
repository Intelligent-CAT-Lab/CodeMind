Here is the Python equivalent of the Java code:

```python
def main():
    A, B = map(int, input().split())
    c = 0
    
    for i in range(2):
        if A >= B:
            c += A
            A -= 1
        else:
            c += B
            B -= 1
    
    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, then it performs the same operations as the Java code. The result is then printed to the console.
