import sys

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = input_stream.readline().strip()
    out = output_stream.write
    solver = ATwoCoins()
    solver.solve(1, in, out)

class ATwoCoins:
    def solve(self, test_number, in, out):
        out.write("Yes" if int(in) + int(in) >= int(in) else "No")

if __name__ == "__main__":
    main()