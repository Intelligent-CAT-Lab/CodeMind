class main:
    import sys
    
    def solve(test_number, in, out):
        out.write(str(in.readline().strip().split()[0]) + in.readline().strip().split()[1] >= in.readline().strip().split()[2]) + "\n")
    
    if __name__ == "__main__":
        in = sys.stdin
        out = sys.stdout
        solve(1, in, out)