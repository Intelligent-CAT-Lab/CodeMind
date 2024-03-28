Below is the translated Python code. It uses the standard input and output capabilities of Python instead of a custom `FastScanner` class.

```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == '__main__':
    main()
```

To run a test case in Python, you can execute the script and provide the input "5 10", either by typing the input manually after running the script, or by using a command like `echo "5 10" | python script.py`, depending on which environment or shell you are using. The expected output is "0", corresponding to the `else` branch in the `if`-`else` statement.
