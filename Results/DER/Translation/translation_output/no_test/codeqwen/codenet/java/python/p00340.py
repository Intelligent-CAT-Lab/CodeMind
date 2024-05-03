Here is the Python equivalent of the Java code:

```python
def main():
    sides = [int(x) for x in input().split()]
    total = sum(sides)
    sides.sort()

    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into a list of integers, sorts the list, and then checks if the first two elements and the last two elements are equal. If they are, it prints "yes", otherwise it prints "no".
