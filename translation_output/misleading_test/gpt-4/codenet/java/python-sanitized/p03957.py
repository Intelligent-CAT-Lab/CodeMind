class FastInput:
    def __init__(self):
        self._input = iter(input().split())

    def read_string(self):
        return next(self._input)


class FastOutput:
    def __init__(self):
        self.buffer = []

    def println(self, text):
        self.buffer.append(f"{text}\n")

    def flush(self):
        print(''.join(self.buffer), end='')

    def close(self):
        self.flush()


class TaskA:
    def solve(self, test_number, in_, out):
        s = in_.read_string()
        c_index = s.find('C')
        f_index = s.rfind('F')
        if c_index == -1 or f_index == -1 or f_index < c_index:
            out.println("No")
        else:
            out.println("Yes")


def main():
    in_ = FastInput()
    out = FastOutput()
    solver = TaskA()
    solver.solve(1, in_, out)
    out.close()


if __name__ == "__main__":
    main()