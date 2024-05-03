Here is the Python equivalent of the Java code you provided:

```python
def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_ = Scanner(input_stream)
    out = PrintWriter(output_stream)
    solver = ATwoCoins()
    solver.solve(1, in_, out)
    out.close()

class ATwoCoins:
    def solve(self, test_number, in_, out):
        out.println(in_.nextInt() + in_.nextInt() >= in_.nextInt() ? "Yes" : "No")

if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in `PrintWriter` class like Java, so I used `print` function instead. Also, Python does not have a built-in `Scanner` class like Java, so I used `input()` function instead. The `sys` module in Python provides access to system-specific parameters and functions.
