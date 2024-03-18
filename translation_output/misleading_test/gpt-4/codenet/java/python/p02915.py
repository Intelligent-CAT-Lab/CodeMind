Here's the equivalent Python code for the provided Java code snippet:

```python
def run():
    S = int(input())
    ans = S ** 3
    print(ans)

if __name__ == "__main__":
    run()
```

And a sample test for the provided test case is given below:

```python
import io
import sys

# Test case using the provided input
test_input = "2"
# Changing the standard input to the test_input
sys.stdin = io.StringIO(test_input)

# Expected output: -46
run()
```
