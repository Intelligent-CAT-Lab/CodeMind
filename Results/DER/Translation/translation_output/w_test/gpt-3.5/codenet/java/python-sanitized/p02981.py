import sys

def solve(input_stream, output_stream):
    n, a, b = map(int, input_stream.readline().split())
    output_stream.write(str(min(a * n, b)))

if __name__ == "__main__":
    solve(sys.stdin, sys.stdout)