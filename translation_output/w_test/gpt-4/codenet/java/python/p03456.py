Here's the translation of the provided Java code into Python:

```python
import math
import sys

def main():
    s, t = input().split()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

Here's how you can test it with the provided test input:

```python
import io
import sys

# Test code
def test():
    input_text = '1 21'
    sys.stdin = io.StringIO(input_text)  # Redirect stdin to simulate input
    main()

test()
```

When you run `test()`, it should print `Yes` as the expected output for the provided test case. The test code sets up the standard input to simulate reading from the console as if a user was inputting `1 21`. The `main` function is then called, executing the translated code.
