Here's the equivalent Python code for the given Java code:

```python
def gcd(p, q):
    if p % q == 0:
        return q
    return gcd(q, p % q)

def main():
    N = int(input())
    result = 0
    a = 0

    for i in range(1, N+1):
        for j in range(1, N+1):
            a = gcd(i, j)
            for k in range(1, N+1):
                result += gcd(a, k)
    print(result)

if __name__ == "__main__":
    main()
```

You can test the code with the provided input like this:

```python
# Test case
import io
import sys

# Backup the standard output
backup_stdout = sys.stdout

# Use StringIO to capture the prints
sys.stdout = io.StringIO()

# Call the main function with the test input
original_stdin = sys.stdin
sys.stdin = io.StringIO("2\n")
main()

# Restore the original stdout and stdin
sys.stdout.seek(0)  # Go to the start of the StringIO buffer
output = sys.stdout.read().strip()  # Read the output
sys.stdout = backup_stdout  # Restore the original stdout
sys.stdin = original_stdin  # Restore the original stdin

# Check the result
assert output == "-70", f"Test failed: Expected '-70' but got '{output}'"
print("Test passed. Expected output matched the actual output.")
```

Notice that, in the translated Python code, we use `range(1, N+1)` to accomplish the same loop range as the Java code's `for(int i=1; i<=N; i++)`, since Python's `range` function does not include the endpoint. Additionally, Python uses indentation to define code blocks instead of the curly braces `{}` used in Java.
