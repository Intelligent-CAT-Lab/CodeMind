class p02833:
    def main(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        inp = MyInput(input_stream)
        solver = TaskX()
        solver.solve(1, inp, output_stream)

    def solve(self, test_number, inp, output_stream):
        n = inp.next_long()
        if n % 2 == 1:
            output_stream.write("0\n")
            return
        ans = 0
        base = 10
        while True:
            if base > n:
                break
            ans += n // base
            base *= 5
        output_stream.write(str(ans) + "\n")

class MyInput:
    def __init__(self, input_stream):
        self.inp = input_stream.readline
        self.pos = 0
        self.read_len = 0
        self.buffer = [0] * 1024 * 8
        self.str = [0] * 500 * 8 * 2
        self.is_digit = [False] * 256
        self.is_space = [False] * 256
        self.is_line_sep = [False] * 256
        for i in range(10):
            self.is_digit[ord('0') + i] = True
        self.is_digit[ord('-')] = True
        self.is_space[ord(' ')] = self.is_space[ord('\r')] = self.is_space[ord('\n')] = self.is_space[ord('\t')] = True
        self.is_line_sep[ord('\r')] = self.is_line_sep[ord('\n')] = True

    def read(self):
        if self.pos >= self.read_len:
            self.pos = 0
            try:
                self.read_len = self.inp().__len__()
            except EOFError: