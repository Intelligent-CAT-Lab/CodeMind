Below is the translated Python code for the given Java code snippet. I have also included a Python way of reading input if you want to test it:

```python
import math

def distance_between_points(input_str):
    # Split the input string to get the individual numbers
    lines = input_str.split()
    # Convert all string values to float and store them in the list
    points = list(map(float, lines))
    # Calculate and return the Euclidean distance
    return math.sqrt((points[0] - points[2])**2 + (points[1] - points[3])**2)

# Sample test case
input_test = '0 0 1 1'
print(distance_between_points(input_test))
```

If you want to use this code to read from standard input (similar to the Java BufferedReader), you can replace the `input_test` line with:

```python
if __name__ == "__main__":
    # Read input from the user
    input_str = input()
    # Output the result
    print(distance_between_points(input_str))
```

The `distance_between_points` function will work the same, and you can provide the input at runtime instead of having it hardcoded.
