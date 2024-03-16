Below is the translated Python code from the provided Java snippet:

```python
# Importing the necessary libraries for the code
import sys

# Constants used in the Java code, translated to Python
INF = float('inf')
MOD = 1_000_000_007
dx4 = [0, 1, 0, -1]
dy4 = [1, 0, -1, 0]
dx8 = [0, 1, 1, 1, 0, -1, -1, -1]
dy8 = [1, 1, 0, -1, -1, -1, 0, 1]

# Main function translated from the Java main method
def main():
    n, k = map(int, sys.stdin.readline().split())
    ans = 0
    for b in range(k + 1, n + 1):
        ans += (n // b) * (b - k) + max(0, (n % b) - k + 1) - (1 if k == 0 else 0)
    print(ans)

# Since we are not dealing with a scanner class as in Java, we directly call the main function
if __name__ == '__main__':
    main()
```

To test the input `5 2`, you can simply run:

```python
# Test case
input_data = "5 2\n"
sys.stdin = io.StringIO(input_data)
main()
```

This will generate the expected output `7`.
