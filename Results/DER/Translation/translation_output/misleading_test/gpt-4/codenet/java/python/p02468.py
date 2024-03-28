```python
import sys

INF = 1 << 30
modP = 1000000007

def power(a, e, modP):
    ret = 1
    while e > 0:
        if e % 2 != 0:
            ret = (ret * a) % modP
        a = (a * a) % modP
        e //= 2
    return ret

def solve(m, n):
    return power(m, n, modP)

def main():
    input_data = sys.stdin.readline().split()
    m = int(input_data[0])
    n = int(input_data[1])
    print(solve(m, n))

if __name__ == "__main__":
    main()
```

To test the provided test case in Python, you can simulate the input by piping an echo command into the Python script, or by modifying the script to accept input in a different way. For example, to run the provided test case, you might use:

```bash
echo "2 3" | python3 script.py
```

Or, for a quick test within the Python script without command-line piping:

```python
def main():
    input_data = "2 3".split()  # instead of sys.stdin.readline().split()
    m = int(input_data[0])
    n = int(input_data[1])
    print(solve(m, n))

# ... rest of the script ...
```

With the quick test, you'd simply run the script normally, and it uses the hardcoded input values.
