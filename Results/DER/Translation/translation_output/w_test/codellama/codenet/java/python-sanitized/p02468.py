import sys

class InputReader:
    def __init__(self, input_stream):
        self.in = input_stream
        self.tok = None

    def next_string(self):
        while not self.tok.has_more_tokens():
            try:
                self.tok = StringTokenizer(self.in.readline(), " ")
            except IOException:
                raise InputMismatchException()
        return self.tok.next_token()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

    def next_int_array(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_int()
        return res

    def next_long_array(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_long()
        return res

class TaskX:
    def solve(self, test_number, in, out):
        m = in.next_int()
        n = in.next_int()
        out.println(self.power(m, n, modP))

    def power(self, a, e, modP):
        ret = 1
        for i in range(e):
            if e % 2 != 0:
                ret = (ret * a) % modP
            a = (a * a) % modP
        return ret

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = InputReader(input_stream)
    out = PrintWriter(output_stream)
    solver = TaskX()
    solver.solve(1, in, out)
    out.close()