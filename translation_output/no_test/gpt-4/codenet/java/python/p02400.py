Here's the equivalent Python code for the given Java program:
```python
import math

def main():
    r = float(input())
    pi = math.pi
    x = r * r * pi
    y = 2 * r * pi
    print(f'{x:.6f} {y:.6f}')

if __name__ == "__main__":
    main()
```
This Python script takes a floating-point number as input for the radius `r` and computes the area `x` and circumference `y` of a circle before printing them to the screen with six decimal places precision.
