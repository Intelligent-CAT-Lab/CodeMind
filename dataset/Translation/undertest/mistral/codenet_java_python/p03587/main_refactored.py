class main:
    import sys
    
    def solve(test_number, in, out):
        s = in.readline()
        n = 0
        for c in s:
            if c == '1':
                n += 1
        out.write(str(n))
        out.flush()
    
    if __name__ == "__main__":
        in = sys.stdin
        out = sys.stdout
        solve(1, in, out)