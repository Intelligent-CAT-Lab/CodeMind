Here is the Python equivalent of the Java code:

```python
import sys

def main():
    lines = sys.stdin.readline().split()
    list_ = [float(i) for i in lines]
    print(pow(pow(list_[0] - list_[2], 2) + pow(list_[1] - list_[3], 2), 0.5))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, splits it into words, converts each word to a float, and stores them in a list. It then calculates the Euclidean distance between the two points and prints the result.
