import sys

class BetterScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.pointer = 0
        self.buffer_length = 0

    def update_buffer(self):
        if self.pointer >= self.buffer_length:
            self.pointer = 0
            try:
                self.buffer_length = self.stream.readinto(self.buffer)
            except IOError:
                pass
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
        while self.update_buffer() and not self.is_printable_char(self.buffer[self.pointer]):
            self.pointer += 1

    def next(self):
        if self.has_next():
            builder = ""
            code_point = self.read()
            while self.is_printable_char(code_point):
                builder += chr(code_point)
                code_point = self.read()
            return builder
        else:
            raise StopIteration

    def next_long(self):
        if self.has_next():
            number = 0
            minus = False
            code_point = self.read()
            if code_point == '-':
                minus = True
                code_point = self.read()
            if code_point >= '0' and code_point <= '9':
                while True:
                    if code_point >= '0' and code_point <= '9':
                        number *= 10
                        number += code_point - '0'
                    elif code_point < 0 or not self.is_printable_char(code_point):
                        return -number if minus else number
                    else:
                        raise ValueError
            else:
                raise ValueError
        else:
            raise StopIteration

    def next_int(self):
        number = self.next_long()
        if number >= sys.maxsize and number <= sys.maxsize:
            return int(number)
        else:
            raise ValueError

    def is_printable_char(self, code_point):
        return code_point >= 33 and code_point <= 126

class p03421:
    def __init__(self):