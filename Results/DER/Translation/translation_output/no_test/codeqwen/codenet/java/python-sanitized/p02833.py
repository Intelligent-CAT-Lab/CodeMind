import sys

class MyInput:
    def __init__(self, input_stream):
        self.in_ = input_stream
        self.pos = 0
        self.read_len = 0
        self.buffer = [0] * 1024 * 8
        self.str = [0] * (500 * 8 * 2)
        self.is_digit = [False] * 256
        self.is_space = [False] * 256
        self.is_line_sep = [False] * 256

        for i in range(10):
            self.is_digit[ord('0') + i] = True
        self.is_digit[ord('-')] = True
        self.is_space[ord(' ')] = self.is_space[ord('\r')] = self.is_space[ord('\n')] = self.is_space[ord('\t')] = True
        self.is_line_sep[ord('\r')] = self.is_line_sep[ord('\n')] = True

    def read(self):
        if self.pos >= self.read_len:
            self.pos = 0
            try:
                self.read_len = self.in_.read(self.buffer)
            except IOError:
                raise RuntimeError()
            if self.read_len <= 0:
                raise MyInput.EndOfFileRuntimeException()
        return self.buffer[self.pos]

    def next_int(self):
        len_ = 0
        self.str[len_] = self.next_char()
        len_ = self.reads(len_, self.is_space)
        i = 0
        ret = 0
        if self.str[0] == ord('-'):
            i = 1
        for _ in range(i, len_):
            ret = ret * 10 + self.str[_] - ord('0')
        if self.str[0] == ord('-'):
            ret = -ret
        return ret

    def next_long(self):