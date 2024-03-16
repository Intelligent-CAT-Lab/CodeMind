from sys import stdin, stdout

class BAlgae:
    def solve(self, in_stream, out_stream):
        r = int(in_stream.readline())
        d = int(in_stream.readline())
        x = int(in_stream.readline())
        
        for i in range(10):
            x = r * x - d
            out_stream.write(str(x) + "\n")

if __name__ == "__main__":
    solver = BAlgae()
    solver.solve(stdin, stdout)