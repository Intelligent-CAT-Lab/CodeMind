def solve(test_number, in_stream, out_stream):
    r = int(in_stream.readline().strip())
    out_stream.write(str(r * r) + '\n')

import sys

if __name__ == "__main__":
    input_data = sys.stdin
    output_data = sys.stdout

    solve(1, input_data, output_data)