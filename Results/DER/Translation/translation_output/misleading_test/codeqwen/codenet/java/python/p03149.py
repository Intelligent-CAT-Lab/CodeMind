Here is the Python equivalent of the Java code:

```python
def main():
    N = [int(i) for i in input().split()]
    N.sort()
    if N == [1, 4, 7, 9]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the user, sorts them, and checks if they are equal to the sorted list [1, 4, 7, 9]. If they are, it prints "YES", otherwise it prints "NO".
