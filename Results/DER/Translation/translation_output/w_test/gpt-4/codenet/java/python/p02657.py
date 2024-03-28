Below is the equivalent Python code for the provided Java code:

```python
def main():
    A, B = map(int, input().split())
    print(A * B)

if __name__ == "__main__":
    main()
```

If you want to test this code with the provided test input, you might run the following in your Python environment:

```python
# Assuming the above function is already defined

# Test input
test_input = "2 5"

# Set up the test input to simulate stdin
import io
import sys

# Replace sys.stdin with a StringIO object with the test input
sys.stdin = io.StringIO(test_input)

# Call the main function which will now take input from the StringIO object
main()

# Restore sys.stdin to its original state if necessary
sys.stdin = sys.__stdin__
```

Upon running this code, you should get the expected output:

```
10
```
