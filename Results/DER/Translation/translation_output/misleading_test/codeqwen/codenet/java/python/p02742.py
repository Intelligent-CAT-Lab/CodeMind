Here is the Python equivalent of the Java code:

```python
def main():
    w, h = map(int, input().split())

    if w == 1 or h == 1:
        print(1)
        return

    c = (w*h)%2 == 0 and (w*h)//2 or (w*h)//2+1
    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the number of squares, and prints the result. The `map` function is used to convert the input string into a list of integers. The `and` operator is used to perform the modulo operation and the floor division operation in a single line.
