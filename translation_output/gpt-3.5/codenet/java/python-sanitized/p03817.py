import sys

class Scanner:
    def __init__(self, input_stream):
        self.inp = input_stream
        self.buffer = bytearray()
        self.pointer = 0
        self.buffer_length = 0

    def close(self):
        self.inp.close()

    def has_next_byte(self):
        if self.pointer < self.buffer_length:
            return True
        else:
            self.pointer = 0
            self.buffer = self.inp.read(1024)
            self.buffer_length = len(self.buffer)
            if self.buffer_length <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            byte_val = self.buffer[self.pointer]
            self.pointer += 1
            return byte_val
        else:
            return -1

    def is_printable_char(self, char_val):
        return ord('!') <= char_val <= ord('~')

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.pointer]):
            self.pointer += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next_long(self):
        if not self.has_next():
            raise ValueError("No more input")
        num = 0
        is_negative = False
        byte_val = self.read_byte()
        if byte_val == ord('-'):
            is_negative = True
            byte_val = self.read_byte()
        if not ord('0') <= byte_val <= ord('9'):
            raise ValueError("Invalid input")
        while True:
            if ord('0') <= byte_val <= ord('9'):
                num *= 10
                num += byte_val - ord('0')
            elif byte_val == -1 or not self.is_printable_char(byte_val):
                return -num if is_negative else num
            else:
                raise ValueError("Invalid input")
            byte_val = self.read_byte()

inp_stream = sys.stdin
out_stream = sys.stdout

sc = Scanner(inp_stream)

x = sc.next_long()
sc.close()

ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
out_stream.write(str(ans) + "\n")
out_stream.flush()