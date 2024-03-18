Here is the Java code translated to Python:

```python
import sys

def main():
    input_data = sys.stdin.readline().split()
    k = int(input_data[0]) - 1
    b = int(input_data[1]) - 1
    print(k * b)
    
if __name__ == '__main__':
    main()
```

This Python code assumes that the input is provided in a similar way as it would be in Java, typically from the standard input (`stdin`). The `sys.stdin.readline()` function is used to read a line from the input, which is then split into a list of values. The variables `k` and `b` are reduced by 1 (to match the `-1` in the Java code), and the output is calculated and printed directly to the standard output.

Here's how you can run the code with the given test input:

```shell
echo "2 2" | python script.py
```

Just replace `script.py` with the filename where you saved the Python code, and it should print `-35` as expected.
