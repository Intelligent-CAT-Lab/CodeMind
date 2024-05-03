def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_ = Scanner(input_stream)
    out = PrintWriter(output_stream)
    solver = ATwoCoins()
    solver.solve(1, in_, out)
    out.close()

class ATwoCoins:
    def solve(self, test_number, in_, out):
        out.println(in_.nextInt() + in_.nextInt() >= in_.nextInt() ? "Yes" : "No")

if __name__ == "__main__":
    main()