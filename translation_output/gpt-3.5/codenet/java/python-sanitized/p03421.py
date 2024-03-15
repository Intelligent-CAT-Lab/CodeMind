import sys

class BetterScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.pointer = 0
        self.buffer_length = 0

    def update_buffer(self):
        if self.pointer >= self.buffer_length:
            self.pointer = 0
            self.buffer = self.stream.read(1024)
            self.buffer_length = len(self.buffer)
            return self.buffer_length > 0
        else:
            return True

    def read(self):
        if self.update_buffer():
            val = self.buffer[self.pointer]
            self.pointer += 1
            return val if val < 128 else -1
        else:
            return -1

    def has_next(self):
        self.skip_unprintable()
        return self.update_buffer()

    def skip_unprintable(self):
        while self.update_buffer() and not 32 <= self.buffer[self.pointer] <= 126:
            self.pointer += 1

    def next(self):
        if self.has_next():
            builder = bytearray()
            code_point = self.read()
            while 32 <= code_point <= 126:
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
            if code_point == 45:
                minus = True
                code_point = self.read()
            if 48 <= code_point <= 57:
                while True:
                    if 48 <= code_point <= 57:
                        number *= 10
                        number += code_point - 48
                    elif code_point < 0 or not 32 <= code_point <= 126:
                        return -number if minus else number
                    else:
                        raise ValueError
                    code_point = self.read()
            else:
                raise ValueError
        else:
            raise StopIteration

    def next_int(self):
        number = self.next_long()
        if -2**31 <= number <= 2**31 - 1:
            return number
        else:
            raise ValueError

def calc_inner(n, a, b, output):
    first = bytearray()
    second = bytearray()
    while True:
        if a <= 0 or b <= 0:
            return False
        first_i = max(n - a + 1, 1)
        for i in range(first_i, n + 1):
            first += str(i).encode() + b" "
        rest = n - a - b + 1
        end_i = max(rest + 1, 1)
        sub_second = bytearray()
        for i in range(first_i - 1, end_i - 1, -1):
            sub_second += str(i).encode() + b" "
        second = sub_second + second
        if rest <= 0:
            output += first + second
            return True
        else:
            n = rest
            a -= 1
            b -= 1

def calc(n, a, b):
    output = bytearray()
    for i in range(n - a + 1, n + 1):
        output += str(i).encode() + b" "
    rest = n - a - b + 1
    if rest < 0:
        sys.stdout.write("-1\n")
        return
    elif rest >= 1:
        if not calc_inner(rest, a - 1, b - 1, output):
            sys.stdout.write("-1\n")
            return
    for i in range(n - a, rest, -1):
        output += str(i).encode() + b" "
    output = output[:-1]
    sys.stdout.buffer.write(output)
    sys.stdout.write("\n")

def main():
    scanner = BetterScanner(sys.stdin)
    n = scanner.next_int()
    a = scanner.next_int()
    b = scanner.next_int()
    calc(n, a, b)

if __name__ == "__main__":
    main()