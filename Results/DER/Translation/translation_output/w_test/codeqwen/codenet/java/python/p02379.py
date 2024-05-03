Here is the Python equivalent of the Java code:

```python
import math

def main():
    lines = input().split()
    list_ = [float(i) for i in lines]
    print(math.sqrt((list_[0]-list_[2])*(list_[0]-list_[2])+(list_[1]-list_[3])*(list_[1]-list_[3])))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into a list of strings, converts each string to a float, and then calculates the distance between the two points. The result is printed to the console.
