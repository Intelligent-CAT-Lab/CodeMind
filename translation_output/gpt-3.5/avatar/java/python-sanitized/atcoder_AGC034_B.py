import sys

class BABC:
    def solve(self, test_number, in_stream, out_stream):
        s = in_stream.readline().strip().replace("BC", "D")
        cnt = 0
        tmp = 0
        for char in s:
            if char == 'A':
                tmp += 1
            elif char == 'D':
                cnt += tmp
            else:
                tmp = 0
        out_stream.write(str(cnt) + "\n")

if __name__ == "__main__":
    solver = BABC()
    solver.solve(1, sys.stdin, sys.stdout)