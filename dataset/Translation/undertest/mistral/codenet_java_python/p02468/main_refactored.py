class main:
    import sys
    
    def power(a, e, modP):
        ret = 1
        for e in range(e):
            if e % 2 == 1:
                ret = (ret * a) % modP
            a = (a * a) % modP
        return ret
    
    def solve(testNumber, in, out):
        m = int(in.readline())
        n = int(in.readline())
        out.write(str(power(m, n, 1000000007)) + "\n")
    
    if __name__ == "__main__":
        in = sys.stdin
        out = sys.stdout
        solve(1, in, out)