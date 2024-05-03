import sys

class UserScanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def read(self):
        self.ptr = 0
        try:
            self.buflen = self.in_stream.readinto(self.buffer)
        except IOError:
            print("Error reading from input stream")
            sys.exit(9)

    def skip_ctl_space(self):
        while self.ptr < self.buflen:
            if not self.is_ctl_space(self.buffer[self.ptr]):
                break
            self.ptr += 1
        self.read()
        self.skip_ctl_space()

    def is_ctl_space(self, b):
        if b <= ' ' or b > '~':
            return True
        else:
            return False

    def close(self):
        try:
            self.in_stream.close()
        except IOError:
            print("Error closing input stream")
            sys.exit(9)

    def next(self):
        self.skip_ctl_space()
        sb = bytearray()
        b = self.get_byte()
        while b != -1:
            sb.append(b)
            b = self.get_byte()
        return sb.decode('utf-8')

    def next_long(self):
        self.skip_ctl_space()
        n = 0
        minus = False
        b = self.get_byte()
        while b != -1:
            if b == '-':
                minus = True
            else:
                n *= 10
                n += int(b - '0')
            b = self.get_byte()
        if minus:
            return n * -1
        else:
            return n

    def next_int(self):
        self.skip_ctl_space()
        n = 0