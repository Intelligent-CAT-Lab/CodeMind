import sys

class Hayami:
  
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = []
        self.idx = 0

    def _read_next_chunk(self):
        return self.input_stream.read(1024)

    def _read_next_char(self):
        if self.idx >= len(self.buffer):
            self.buffer = self._read_next_chunk()
            self.idx = 0
            if not self.buffer:
                return None
        res = self.buffer[self.idx]
        self.idx += 1
        return res

    @staticmethod
    def _is_printable_char(c):
        return 33 <= ord(c) <= 126

    def _skip_non_printable_chars(self):
        char = self._read_next_char()
        while char and not self._is_printable_char(char):
            char = self._read_next_char()

    def next_token(self):
        self._skip_non_printable_chars()
        if not self.buffer:
            raise StopIteration
        token = []
        char = self._read_next_char()
        while char and self._is_printable_char(char):
            token.append(char)
            char = self._read_next_char()
        return ''.join(token)

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return int(self.next_token())  # Python does not differentiate

    def next_float(self):
        return float(self.next_token())

    def close(self):
        # In Python, stdin doesn't really need to be explicitly closed, but let's include the method for completeness
        pass


def main():
    saori = Hayami()
    n = saori.next_int()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
    saori.close()

if __name__ == "__main__":
    main()