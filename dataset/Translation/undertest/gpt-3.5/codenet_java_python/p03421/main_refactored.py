class main:
    import sys
    from io import StringIO
    import traceback
     
    class BetterScanner:
        def __init__(self, input_str):
            self.stream = StringIO(input_str)
            self.buffer = bytearray(1024)
            self.pointer = 0
            self.buffer_length = 0
     
        def update_buffer(self):
            if self.pointer >= self.buffer_length:
                self.pointer = 0
                try:
                    self.buffer_length = self.stream.readinto(self.buffer)
                except IOError as exception:
                    traceback.print_exc()
                return self.buffer_length > 0
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
            while self.update_buffer() and not (32 < self.buffer[self.pointer] < 127):
                self.pointer += 1
     
        def next(self):
            if self.has_next():
                builder = bytearray()
                code_point = self.read()
                while 32 < code_point < 127:
                    builder.append(code_point)
                    code_point = self.read()
                return builder.decode()
            else:
                raise StopIteration()
     
        def next_long(self):
            if self.has_next():
                num = 0
                minus = False
                code_point = self.read()
                if code_point == 45:  # ASCII value for '-'
                    minus = True
                    code_point = self.read()
     
                while 48 <= code_point <= 57:  # ASCII values for '0' to '9'
                    num = num * 10 + (code_point - 48)
                    code_point = self.read()
     
                if code_point == -1 or not (32 < code_point < 127):
                    return -num if minus else num
                else:
                    raise ValueError
            else:
                raise StopIteration()
     
        def next_int(self):
            num = self.next_long()
            if -(2**31) <= num <= 2**31 - 1:
                return int(num)
            else:
                raise ValueError
     
    def calc(n, a, b):
        output = []
        for i in range(n - a + 1, n + 1):
            output.append(str(i))
        rest = n - a - b + 1
        if rest < 0:
            return "-1"
        elif rest >= 1:
            inner_result = calc_inner(rest, a - 1, b - 1)
            if not inner_result:
                return "-1"
        for i in range(n - a, rest, -1):
            output.append(str(i))
        return ' '.join(output)
     
    def calc_inner(n, a, b):
        first = []
        second = []
        while True:
            if a <= 0 or b <= 0:
                return False
            first_i = n - a + 1 if n - a + 1 >= 1 else 1
            for i in range(first_i, n + 1):
                first.append(str(i))
            rest = n - a - b + 1
            end_i = rest + 1 if rest + 1 >= 1 else 1
            sub_second = []
            for i in range(first_i - 1, end_i, -1):
                sub_second.append(str(i))
            second = sub_second + second
            if rest <= 0:
                return True
            else:
                n = rest
                a -= 1
                b -= 1
     
    input_str = input()
    scanner = BetterScanner(input_str)
    n = scanner.next_int()
    a = scanner.next_int()
    b = scanner.next_int()
    result = calc(n, a, b)
    print(result)