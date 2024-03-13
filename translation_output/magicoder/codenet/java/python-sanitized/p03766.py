import sys
import io
import array

class FastInput:
    def __init__(self, is_):
        self.is_ = is_
        self.buf = array.array('B', b'\0' * (1 << 13))
        self.buf_len = 0
        self.buf_offset = 0
        self.next = -1

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len = self.is_.readinto(self.buf)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1

        self.skip_blank()
        if self.next == ord('+') or self.next == ord('-'):
            sign = self.next == ord('+') and 1 or -1
            self.next = self.read()

        val = 0
        if sign == 1:
            while self.next >= ord('0') and self.next