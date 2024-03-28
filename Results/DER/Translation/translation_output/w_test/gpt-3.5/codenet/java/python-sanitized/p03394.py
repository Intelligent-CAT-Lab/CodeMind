# Enclosing the solution translated from Java to Python

import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = ''
        self.pointer = 0

    def next_int(self):
        while self.pointer < len(self.buf) and not self.buf[self.pointer].isdigit():
            self.pointer += 1

        start = self.pointer
        while self.pointer < len(self.buf) and self.buf[self.pointer].isdigit():
            self.pointer += 1

        return int(self.buf[start:self.pointer])

    def read(self):
        while not self.buf or self.pointer >= len(self.buf):
            self.buf = self.stream.readline()
            self.pointer = 0

    def is_space_char(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def read_int(self):
        while True:
            self.read()
            c = self.read()
            while self.is_space_char(c):
                c = self.read()
            if c == -1:
                return -1

            sgn = 1
            if c == '-':
                sgn = -1
                c = self.read()
            res = 0
            while not self.is_space_char(c):
                if not c.isdigit():
                    raise ValueError("Invalid input")
                res = res * 10 + int(c)
                c = self.read()
            return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def print(self, *args, sep=' '):
        self.stream.write(sep.join(map(str, args)))

    def println(self, *args):
        self.print(*args)
        self.stream.write('\n')

if __name__ == "__main__":
    input_reader = InputReader(sys.stdin)
    output_writer = OutputWriter(sys.stdout)

    n = input_reader.next_int()

    if n == 3:
        output_writer.println("2 5 63")
    elif n == 4:
        output_writer.println("2 5 20 63")
    else:
        ans = []
        _2 = 0
        _3 = 0
        _23 = 0
        i = 2
        while len(ans) < n - 2:
            num = i
            if num % 2 == 0 and num % 3 == 0:
                _23 += 1
            elif num % 2 == 0:
                _2 += num
            elif num % 3 == 0:
                _3 += num

            if num % 2 == 0 or num % 3 == 0:
                ans.append(num)
            i += 1

        k = i
        sn = -1
        while True:
            num = i
            if num % 2 == 0 and (_2 % 3 == 0 or num % 3 != 0) and (_2 + num) % 3 == 0:
                sn = num
                ans.append(num)
                break
            i += 1

        i = k
        while True:
            num = i
            if num % 3 == 0 and (_3 % 2 == 0 or num % 2 != 0) and num != sn and (_3 + num) % 2 == 0:
                ans.append(num)
                break
            i += 1

        for j in range(len(ans)):
            output_writer.print(ans[j])
            if j < len(ans) - 1:
                output_writer.print(' ')

    output_writer.stream.flush()