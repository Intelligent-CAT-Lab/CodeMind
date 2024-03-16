import sys

class AAccepted:
    def solve(self, testNumber, inp, out):
        s = inp.readline().strip()
        n = sum(1 for c in s if c == '1')
        out.write(str(n) + '\n')

def main():
    in_stream = sys.stdin
    out_stream = sys.stdout
    inp = in_stream
    out = out_stream
    
    solver = AAccepted()
    solver.solve(1, inp, out)
    out_stream.flush()

if __name__ == "__main__":
    main()