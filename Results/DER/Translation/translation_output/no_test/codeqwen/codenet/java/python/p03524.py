Here is the Python equivalent of the Java code:

```python
def main():
    S = input()
    a = b = c = 0
    for x in S:
        if x == 'a':
            a += 1
        elif x == 'b':
            b += 1
        elif x == 'c':
            c += 1
    if max(max(a,b),c)-min(min(a,b),c) <= 1:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of 'a', 'b', and 'c' characters in the string, and then checks if the difference between the maximum and minimum counts is less than or equal to 1. If it is, it prints "YES", otherwise it prints "NO".
