Here is the Python equivalent of your Java code:

```python
import math

def main():
    lines = input().split()
    list_ = [float(line) for line in lines]
    print(math.sqrt((list_[0]-list_[2])*(list_[0]-list_[2])+(list_[1]-list_[3])*(list_[1]-list_[3])))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as your Java code. It reads a line of input, splits it into four parts, converts each part to a float, and stores them in a list. It then calculates the distance between the two points and prints the result.
