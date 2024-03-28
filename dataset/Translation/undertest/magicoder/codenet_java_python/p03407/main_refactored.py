class main:
    import sys
    
    def solve(testNumber, in_stream, out_stream):
        a, b, c = map(int, in_stream.readline().split())
        out_stream.write("Yes" if a + b >= c else "No")
    
    if __name__ == "__main__":
        solve(1, sys.stdin, sys.stdout)