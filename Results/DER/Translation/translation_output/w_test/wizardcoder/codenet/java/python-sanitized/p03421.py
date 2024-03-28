import sys

class BetterScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.pointer = 0
        self.bufferLength = 0

    def update_buffer(self):
        if self.pointer >= self.bufferLength:
            self.pointer = 0
            try:
                self.bufferLength = self.stream.readinto(self.buffer)
            except Exception as e:
                print(e, file=sys.stderr)
                return False
            return self.bufferLength > 0
        else:
            return True

    def read(self):
        if self.update_buffer():
            return self.buffer[self.pointer]
        else:
            return -1

    def has_next(self):
        self.skip_unprintable()
        return self.update_buffer()

    def skip_unprintable(self):
        while self.update_buffer() and not self.is_printable_char(self.buffer[self.pointer]):
            self.pointer += 1

    def next(self):
        if self.has_next():
            builder = bytearray()
            code_point = self.read()
            while self.is_printable_char(code_point):
                builder.append(code_point)
                code_point = self.read()
            return builder.decode()
        else:
            raise StopIteration

    def next_long(self):
        if self.has_next():
            number = 0
            minus = False
            code_point = self.read()
            if code_point == ord('-'):
                minus = True
                code_point = self.read()
            if code_point >= ord('0') and code_point <= ord('9'):
                while True:
                    if code_point >= ord('0') and code_point <= ord('9'):
                        number *= 10
                        number += code_point - ord('0')
                    elif code_point < 0 or not self.is_printable_char(code_point):
                        return (-number if minus else number)
                    else:
                        raise ValueError("Invalid input")
                    code_point = self.read()
            else:
                raise ValueError("Invalid input")
        else:
            raise StopIteration

    def next_int(self):
        number = self.next_long()
        if number >= -2**31 and number <= 2**31 - 1:
            return int(number)
        else:
            raise ValueError("Out of range")

    def is_printable_char(self, code_point):
        return code_point >= 33 and code_point <= 126

class p03421:
    def __init__(self):
        self.scanner = BetterScanner(sys.stdin.buffer)
        self.output = bytearray()

    def run(self):
        n = self.scanner.next_int()
        a = self.scanner.next_int()
        b = self.scanner.next_int()

        self.calc(n, a, b)

    def calc(self, n, a, b):
        for i in range(n - a + 1, n + 1):
            self.output.extend(str(i).encode())
            self.output.append(ord(' '))
        rest = n - a - b + 1
        if rest < 0:
            print(-1)
            return
        elif rest >= 1:
            if not self.calc_inner(rest, a - 1, b - 1):
                print(-1)
                return
        for i in range(n - a, rest, -1):
            self.output.extend(str(i).