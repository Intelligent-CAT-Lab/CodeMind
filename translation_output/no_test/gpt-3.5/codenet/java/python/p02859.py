```python
def solve(test_number, in_stream, out_stream):
    r = int(in_stream.readline().strip())
    out_stream.write(str(r * r) + '\n')

import sys

if __name__ == "__main__":
    input_data = sys.stdin
    output_data = sys.stdout

    solve(1, input_data, output_data)
``` 

This Python code replicates the functionality of the provided Java code and performs the same task of calculating the square of an integer input.
