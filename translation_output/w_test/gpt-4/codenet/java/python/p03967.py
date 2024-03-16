Here is the translated version of the Java code into Python:

```python
def main():
    top = input()
    cpp = False
    score = 0
    for j in range(len(top)):
        if cpp:
            if top[j] == 'g':
                score += 1
            cpp = False
        else:
            if top[j] == 'p':
                score -= 1
            cpp = True
    print(score)

if __name__ == "__main__":
    main()
```

To test the provided test case:

```python
import io
import sys

# Test case
def test():
    sys.stdin = io.StringIO("gpg")
    main()

# Call the test function
test()
```

The expected output after calling `test()` would be `0` printed to the console.
