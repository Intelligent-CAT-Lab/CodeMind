Here is the Python equivalent of the Java code:

```python
def main():
    line = input()
    sides = [int(i) for i in line.split()]
    total = sum(sides)
    sides.sort()

    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into a list of integers, calculates the total of the sides, sorts the list, and then checks if the first two sides are equal and the last two sides are equal. If they are, it prints "yes", otherwise it prints "no".
