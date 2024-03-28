class main:
    import sys
    
    def solve(in, out, ms):
        a, b = map(int, in.readline().strip().split())
        out.write(str(max(1, (b+a-1)//a)))
    
    if __name__ == "__main__":
        in = sys.stdin
        out = sys.stdout
        ms = Methods()
        solve(in, out, ms)