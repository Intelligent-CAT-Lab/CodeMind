class FastScanner:
    def __init__(self):
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def read_byte(self):
        if self.ptr < self.buflen:
            return self.buffer[self.ptr]
        else:
            self.ptr = 0
            try:
                self.buflen = self.read(self.buffer)
            except Exception as e:
                print(e)
            if self.buflen <= 0:
                return -1
            return self.buffer[self.ptr]

    def has_next_byte(self):
        return self.ptr < self.buflen

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError("No more input")
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode('utf-8')

    def next_int(self):
        try:
            return int(self.next())
        except ValueError:
            raise ValueError("Invalid integer input")

    def next_long(self):
        try:
            return int(self.next())
        except ValueError:
            raise ValueError("Invalid long input")

    def next_double(self):
        try:
            return float(self.next())
        except ValueError:
            raise ValueError("Invalid double input")

    def read(self, buffer):
        return os.read(0, len(buffer))

class p02341:
    def run(self):
        sc =