Below is the translated Python code enclosed within ```python``` as requested:

```python
import sys

class MyScanner:
    def __init__(self):
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = sys.stdin.readline().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

def main():
    sc = MyScanner()
    N = sc.next_int()
    MOD = sc.next_int()

    table = [[0] * (N + 1) for _ in range(N + 1)]
    for rem in range(N + 1):
        table[N][rem] = rem
    for pos in range(N - 1, 0, -1):
        for rem in range(N + 1):
            table[pos][rem] = table[pos + 1][rem]
            factor = min(pos, N + 1 - pos)
            if factor < rem:
                table[pos][rem] += table[pos][rem - factor]
                table[pos][rem] %= MOD
    print(table[1][N])

if __name__ == "__main__":
    main()
```

To test the given input `2 998244353` with the translated Python code, you would need to provide it as standard input, as the `MyScanner` class is reading from `sys.stdin`. Here's an example of how you might run the code using a command line:

```bash
echo "2 998244353" | python translated_script.py
```

The script `translated_script.py` would be the file containing the above Python code. This would then output `3` as the expected output.
