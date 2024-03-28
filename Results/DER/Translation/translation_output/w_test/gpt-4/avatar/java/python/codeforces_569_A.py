Here's the translated Python code, which reads from standard input and prints the expected output:

```python
import sys

def solve(t, s, q):
    sum = 0
    while s < t:
        s = s * q
        sum += 1
    return sum

def main():
    t, s, q = map(int, input().split())
    print(solve(t, s, q))

if __name__ == "__main__":
    main()
```

You can use the following test input to check the expected output:

```plaintext
100000 3125 2
```

And the expected output should be:

```plaintext
5
```
