Below is the translated Python code that takes input similarly and computes the distance between two points, given their coordinates. The result is printed with the same precision as in the Java code example.

```python
import math

def main():
    lines = input().split()
    coords = [float(num) for num in lines]
    distance = math.sqrt((coords[0] - coords[2])**2 + (coords[1] - coords[3])**2)
    print("{:.8f}".format(distance))

if __name__ == '__main__':
    main()
```

Test this Python code with the provided input to get the expected output.
