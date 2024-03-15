Below is the equivalent Python code for the given Java code:

```python
import math

def main():
    lines = input().split(" ")
    list_values = [float(value) for value in lines]
    print(math.sqrt((list_values[0] - list_values[2])**2 + (list_values[1] - list_values[3])**2))

if __name__ == "__main__":
    main()
```

This Python code takes input from the console, splits it by spaces into a list, converts each string to a float, and then calculates the Euclidean distance between the two points represented by the numbers in the list, similar to what the Java code does.
