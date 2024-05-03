Here is the Python equivalent of the Java code:

```python
def main():
    P = int(input())
    Q = int(input())
    R = int(input())

    max = 0

    if P >= Q:
        if P >= R:
            max = Q + R
        else:
            max = P + Q
    elif Q >= R:
        if Q >= P:
            max = P + R
        else:
            max = Q + R
    elif R >= P:
        if R >= Q:
            max = P + Q
        else:
            max = P + R

    print(max)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, and then determines the maximum sum of two of them. It then prints out the maximum sum.
