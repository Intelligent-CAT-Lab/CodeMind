Here is the Java code translated into Python:

```python
def next_int():
    return int(input())

def main():
    h1 = next_int()
    m1 = next_int()
    h2 = next_int()
    m2 = next_int()
    k = next_int()
    h = h2 - h1
    m = m2 - m1
    day = (h * 60) + m
    print(day - k)

if __name__ == '__main__':
    main()
```

To test the code with the provided test input, you can run the following in your Python environment:

```python
import sys
from io import StringIO

# Backup the standard input
original_stdin = sys.stdin

# Test input string
test_input = '10 0 15 0 30'

# Use StringIO to simulate the stdin
sys.stdin = StringIO(test_input)

# Call main function to process the test input
main()

# Restore the standard input to its original state
sys.stdin = original_stdin
```

When you run this entire test script, the expected output should be `270`.
