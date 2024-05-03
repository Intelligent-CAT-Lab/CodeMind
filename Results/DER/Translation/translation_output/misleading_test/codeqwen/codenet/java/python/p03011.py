Here is the Python equivalent of the Java code:

```python
def main():
    P, Q, R = map(int, input().split())
    max_val = 0

    if P >= Q:
        if P >= R:
            max_val = Q + R
        else:
            max_val = P + Q
    elif Q >= R:
        if Q >= P:
            max_val = P + R
        else:
            max_val = Q + R
    elif R >= P:
        if R >= Q:
            max_val = P + Q
        else:
            max_val = P + R

    print(max_val)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, and then determines the maximum value by comparing the three numbers. The maximum value is then printed to the console.
