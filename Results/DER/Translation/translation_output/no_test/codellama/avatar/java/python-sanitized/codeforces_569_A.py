import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def has_next(self):
        while self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = self.reader.readline()
            except Exception as e:
                return False
        return True

    def next(self):
        while self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = self.reader.readline()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.next_token()

    def next_line(self):
        str = None
        try:
            str = self.reader.readline()
        except Exception as e:
            e.printStackTrace()
        return str

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return int(self.next())

    def next_big_integer(self):
        return int(self.next())

    def next_big_decimal(self):
        return float(self.next())

class TaskA:
    def solve(self, test_number, in, out):
        t = in.next_int()
        s = in.next_int()
        q = in.next_int()
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        out.println(sum)

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = InputReader(input_stream)
    out = PrintWriter(output_stream)
    solver = TaskA()
    solver.solve(1, in, out)
    out.close()