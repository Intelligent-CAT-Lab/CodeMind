import sys

def solve(in, out, ms):
    n, k = map(int, in.readline().strip().split())
    for bit in range(1 << n):
        if len(bin(bit)) == k:
            out.write(f"{bit:0{n}b}:")
            for j in range(n):
                if (bit >> j) & 1:
                    out.write(f" {j}")
            out.write("\n")

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    ms = Methods()
    solve(in, out, ms)