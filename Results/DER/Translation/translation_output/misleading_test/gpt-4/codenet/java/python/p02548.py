Below is the translated Python code:

```python
def main():
    n = int(input())
    cnt = 0
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            if i * j < n:
                cnt += 1
            else:
                break
    print(cnt)

if __name__ == "__main__":
    main()
```

To test the code, you can run the following:

```python
import io
import sys

test_input = "3"
# Set the StringIO with test input as the standard input
sys.stdin = io.StringIO(test_input)

main()
```

Expected output for the provided test case should be `83`.
