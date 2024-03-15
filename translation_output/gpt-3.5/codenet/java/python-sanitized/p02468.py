import sys
from io import BytesIO, IOBase

class TaskX:
    def solve(self, in_data):
        m, n, modP = map(int, in_data.split())
        return self.power(m, n, modP)

    def power(self, a, e, modP):
        ret = 1
        for _ in range(e):
            if e % 2 != 0:
                ret = (ret * a) % modP
            a = (a * a) % modP
        return ret

def main():
    input_data = sys.stdin.buffer.read().decode("utf-8")
    solver = TaskX()
    result = solver.solve(input_data)
    sys.stdout.write(str(result) + '\n')

if __name__ == "__main__":
    main()