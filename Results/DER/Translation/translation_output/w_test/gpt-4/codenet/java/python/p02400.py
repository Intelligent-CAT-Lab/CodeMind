Below is the translated Python code:
```python
import math

r = float(input())  # Reads the radius input
pi = math.pi
x = r * r * pi  # Area of the circle
y = 2 * r * pi  # Circumference of the circle

# Using %.6f to print the output with 6 decimal places, similar to the Java printf
print(f"{x:.6f} {y:.6f}")
```

Now if we input `2` as defined in the test case, we will get the expected output `12.566371 12.566371`.
