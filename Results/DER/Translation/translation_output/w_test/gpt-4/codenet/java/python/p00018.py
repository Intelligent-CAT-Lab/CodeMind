Here's the Python translation of the provided Java code:

```python
def strkn(ans):
    return " ".join(map(str, sorted(ans, reverse=True)))

def main():
    input_numbers = list(map(int, input().split()))
    print(strkn(input_numbers))

if __name__ == '__main__':
    main()
```

Given your test input, it would work like this:

```python
# Test input
test_input = '3 6 9 7 5\n'

# Execute the main function after setting up stdin from the test_input
import io
import sys

backup = sys.stdin  # Backup the original stdin
sys.stdin = io.StringIO(test_input)  # Set the StringIO object as stdin

main()  # Call main, which now reads from StringIO object

sys.stdin = backup  # Reset the stdin to its original value
```

If you run the above script with the test input, it will produce the expected output:

```
9 7 6 5 3
```
