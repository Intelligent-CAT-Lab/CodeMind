import io
import sys

MOD = 1_000_000_007  # 10^9+7
MAX = 2_147_483_646  # intMax


class Hayami:
    def __init__(self):
        self.input_stream = io.BytesIO(sys.stdin.buffer.read())
        self.buffer = bytearray(1024)
        self.buf_pos = 0
        self.buf_end = 0

    def _fill_buffer(self):
        self.buf_end = self.input_stream.readinto(self.buffer)
        self.buf_pos = 0
        return self.buf_end

    def _next_char(self):
        if self.buf_pos >= self.buf_end and self._fill_buffer() == 0:
            return -1
        result = self.buffer[self.buf_pos]
        self.buf_pos += 1
        return result

    @staticmethod
    def _is_printable_char(ch):
        return 33 <= ch <= 126

    def _skip_unprintable(self):
        ch = self._next_char()
        while ch != -1 and not self._is_printable_char(ch):
            ch = self._next_char()
        return ch

    def next_token(self):
        ch = self._skip_unprintable()
        if ch == -1:
            raise ValueError("No more tokens")
        token = bytearray()
        while self._is_printable_char(ch):
            token.append(ch)
            ch = self._next_char()
        return token.decode('ascii')

    def next_int(self):
        value = int(self.next_token())
        if value < -(2 ** 31) or value > (2 ** 31 - 1):
            raise ValueError("Integer value out of bounds")
        return value

    def next_long(self):
        return int(self.next_token())

    def next_double(self):
        return float(self.next_token())

    def close(self):
        self.input_stream.close()


def main():
    saori = Hayami()
    n = saori.next_int()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")

    saori.close()


if __name__ == '__main__':
    main()